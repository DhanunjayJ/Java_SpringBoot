package com.dj.thread;

import com.dj.model.Transaction;
import com.dj.repository.TransactionRepository;
import java.util.List;
import java.util.stream.Collectors;

public class NotificationThread implements Runnable {
    private final TransactionRepository transRepo = new TransactionRepository();
    private volatile boolean running = true;

    public void stopThread(){
        this.running = false;
    }

    @Override
    public void run () {
        while(running){
            try{
                Thread.sleep(10000);

                List<Transaction> all = transRepo.getAllTransactionsForAdmin();

                List<Transaction> bigTransactions = all.stream()
                .filter(t -> t.getAmount()>5000)
                .collect(Collectors.toList());

                if(!bigTransactions.isEmpty()){
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("\n [SYSTEM ALERT] High Value transactions detected in the system");
                    System.out.println("[ALERT] Number of Transactions > $5000 :" + bigTransactions.size());
                    System.out.println("Continue with your task : ");
                    System.out.println("-------------------------------------------------------------------");
                }
            } catch (InterruptedException e){
                System.out.println("[System] Notification interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }
}