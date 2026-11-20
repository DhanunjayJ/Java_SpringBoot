package com.loganalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SingleThreadAnalyzer {

    public static List<FileReport> analyzeDirectory(Path logDirectory) throws IOException {
        List<FileReport> reports = new ArrayList<>();

        // Find all .log files in the directory and sort them for consistent order
        List<Path> logFiles;
        try (Stream<Path> paths = Files.list(logDirectory)) {
            logFiles = paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".log"))
                    .sorted()
                    .toList();
        }

        // Process each file sequentially on the current (main) thread
        for (Path file : logFiles) {
            reports.add(parseFile(file));
        }

        return reports;
    }

    public static FileReport parseFile(Path filePath) throws IOException {
        long info = 0;
        long warn = 0;
        long error = 0;

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(" INFO ")) {
                    info++;
                } else if (line.contains(" WARN ")) {
                    warn++;
                } else if (line.contains(" ERROR ")) {
                    error++;
                }
            }
        }

        return new FileReport(filePath.getFileName().toString(), info, warn, error);
    }
}