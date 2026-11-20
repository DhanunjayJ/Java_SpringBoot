package com.loganalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        String logDir = "Projects/multithreading/log-analyzer/logs";
        Path logPath = Paths.get(logDir);

        // Phase 1: Generate 10 files with 50,000 lines each (500,000 total lines)
        LogGenerator.generateLogs(logDir, 10, 50_000);

        // Phase 2: Single-Threaded Baseline
        System.out.println("--- Phase 2: Running Single-Threaded Analyzer ---");
        Instant singleStart = Instant.now();
        List<FileReport> singleThreadReports = SingleThreadAnalyzer.analyzeDirectory(logPath);
        long singleThreadMs = Duration.between(singleStart, Instant.now()).toMillis();

        printSummary("Single-Threaded", singleThreadReports, singleThreadMs);

        // Phase 3 & 4: Multi-Threaded Analyzer + Real-Time AlertMonitor
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.printf("--- Phase 3 & 4: Running Multi-Threaded Analyzer (%d workers + AlertMonitor) ---%n", coreCount);

        Instant multiStart = Instant.now();
        List<FileReport> multiThreadReports = analyzeMultiThreaded(logPath, coreCount);
        long multiThreadMs = Duration.between(multiStart, Instant.now()).toMillis();

        printSummary("Multi-Threaded", multiThreadReports, multiThreadMs);

        double speedup = (double) singleThreadMs / Math.max(1, multiThreadMs);
        System.out.printf("Speedup: %.2fx faster with %d threads!%n", speedup, coreCount);
    }

    private static List<FileReport> analyzeMultiThreaded(Path logDirectory, int threadCount) throws Exception {
        List<Path> logFiles = getLogFiles(logDirectory);
        List<FileReport> reports = new ArrayList<>();

        // Shared thread-safe queue connecting Producers (LogParserTasks) to Consumer (AlertMonitor)
        BlockingQueue<String> alertQueue = new LinkedBlockingQueue<>();

        // Start the background Consumer thread
        AlertMonitor monitor = new AlertMonitor(alertQueue);
        Thread monitorThread = new Thread(monitor, "Alert-Monitor-Thread");
        monitorThread.start();

        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        try {
            // 1. Submit all tasks (Producers)
            List<Future<FileReport>> futures = new ArrayList<>();
            for (Path file : logFiles) {
                futures.add(executor.submit(new LogParserTask(file, alertQueue)));
            }

            // 2. Wait for all worker threads to finish parsing
            for (Future<FileReport> future : futures) {
                reports.add(future.get());
            }
        } finally {
            executor.shutdown();
            // 3. Signal AlertMonitor to stop now that no more alerts will be produced
            alertQueue.put(AlertMonitor.POISON_PILL);
            monitorThread.join(); // Wait for AlertMonitor to finish draining the queue
        }

        System.out.printf("  -> AlertMonitor processed %d critical PaymentService alerts in real time.%n%n",
                monitor.getAlertsProcessed());

        return reports;
    }

    public static List<Path> getLogFiles(Path logDirectory) throws IOException {
        try (Stream<Path> paths = Files.list(logDirectory)) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".log"))
                    .sorted()
                    .toList();
        }
    }

    private static void printSummary(String mode, List<FileReport> reports, long durationMs) {
        long totalInfo = 0;
        long totalWarn = 0;
        long totalError = 0;

        for (FileReport r : reports) {
            totalInfo += r.infoCount();
            totalWarn += r.warnCount();
            totalError += r.errorCount();
        }

        System.out.printf("[%s] Processed %d files (%d lines) in %d ms%n",
                mode, reports.size(), (totalInfo + totalWarn + totalError), durationMs);
        System.out.printf("Totals -> INFO: %d | WARN: %d | ERROR: %d%n%n",
                totalInfo, totalWarn, totalError);
    }
}