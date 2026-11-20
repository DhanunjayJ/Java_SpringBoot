package com.loganalyzer;

public record FileReport(
    String fileName,
    long infoCount,
    long warnCount,
    long errorCount
) {
    public long totalLines(){
        return infoCount + warnCount + errorCount;
    }
}
