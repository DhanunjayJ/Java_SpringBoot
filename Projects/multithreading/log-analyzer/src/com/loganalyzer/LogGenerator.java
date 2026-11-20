package com.loganalyzer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LogGenerator {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final List<String> INFO_MESSAGES = List.of(
            "User authentication succeeded",
            "Order processed successfully",
            "Cache refreshed for catalog items",
            "Health check passed"
    );

    private static final List<String> WARN_MESSAGES = List.of(
            "High memory usage detected (82%)",
            "Slow database query took 450ms",
            "API rate limit approaching threshold"
    );

    private static final List<String> ERROR_MESSAGES = List.of(
            "Database connection timeout",
            "NullPointerException in PaymentService",
            "Failed to reach external shipping gateway"
    );

    public static void generateLogs(String directoryPath, int fileCount, int linesPerFile) throws IOException {
        Path dir = Paths.get(directoryPath);
        if (!Files.exists(dir)) {
            Files.createDirectories(dir);
        }

        System.out.printf("Generating %d log files (%d lines each)...%n", fileCount, linesPerFile);

        for (int i = 1; i <= fileCount; i++) {
            Path filePath = dir.resolve("server-" + i + ".log");
            writeSingleFile(filePath, linesPerFile);
        }

        System.out.println("Log generation complete!\n");
    }

    private static void writeSingleFile(Path filePath, int linesCount) throws IOException {
        // ThreadLocalRandom is faster and safer than Math.random() in concurrent environments
        ThreadLocalRandom random = ThreadLocalRandom.current();
        String timestamp = LocalDateTime.now().format(FORMATTER);

        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            for (int j = 0; j < linesCount; j++) {
                int roll = random.nextInt(100);
                String level;
                String message;

                // ~80% INFO, ~15% WARN, ~5% ERROR (realistic server log distribution)
                if (roll < 80) {
                    level = "INFO ";
                    message = INFO_MESSAGES.get(random.nextInt(INFO_MESSAGES.size()));
                } else if (roll < 95) {
                    level = "WARN ";
                    message = WARN_MESSAGES.get(random.nextInt(WARN_MESSAGES.size()));
                } else {
                    level = "ERROR";
                    message = ERROR_MESSAGES.get(random.nextInt(ERROR_MESSAGES.size()));
                }

                writer.write(timestamp + " " + level + " " + message);
                writer.newLine();
            }
        }
    }
}