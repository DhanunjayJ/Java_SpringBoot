package com.loganalyzer;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class LogParserTask implements Callable<FileReport> {

    private final Path filePath;
    private final BlockingQueue<String> alertQueue;

    public LogParserTask(Path filePath, BlockingQueue<String> alertQueue) {
        this.filePath = filePath;
        this.alertQueue = alertQueue;
    }

    @Override
    public FileReport call() throws Exception {
        long info = 0;
        long warn = 0;
        long error = 0;
        String fileName = filePath.getFileName().toString();

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(" INFO ")) {
                    info++;
                } else if (line.contains(" WARN ")) {
                    warn++;
                } else if (line.contains(" ERROR ")) {
                    error++;

                    // Push critical PaymentService errors to the real-time AlertMonitor
                    if (line.contains("PaymentService")) {
                        alertQueue.put("[" + fileName + "] " + line);
                    }
                }
            }
        }

        return new FileReport(fileName, info, warn, error);
    }
}