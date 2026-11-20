package com.loganalyzer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class AlertMonitor implements Runnable {

    public static final String POISON_PILL = "__STOP_ALERT_MONITOR__";

    private final BlockingQueue<String> alertQueue;
    private final AtomicInteger alertsProcessed = new AtomicInteger(0);

    public AlertMonitor(BlockingQueue<String> alertQueue) {
        this.alertQueue = alertQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Blocks efficiently until an alert is available in the queue
                String alertMessage = alertQueue.take();

                // Check for shutdown signal
                if (POISON_PILL.equals(alertMessage)) {
                    break;
                }

                int count = alertsProcessed.incrementAndGet();
                // Print only the first 5 alerts to keep console output clean, while counting all of them
                if (count <= 5) {
                    System.out.println("  [REAL-TIME ALERT #" + count + "] " + alertMessage);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getAlertsProcessed() {
        return alertsProcessed.get();
    }
}