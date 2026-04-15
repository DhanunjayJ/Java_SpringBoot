package com.dj.thread;

import com.dj.model.Transaction;
import com.dj.repository.TransactionRepository;
import java.util.List;
import java.util.stream.Collectors;

public class NotificationThread implements Runnable {
    private final TransactionRepository transRepo = new TransactionRepository();
    private volatile boolean running = false;

    public void stopThread(){
        this.running = false;
    }
}