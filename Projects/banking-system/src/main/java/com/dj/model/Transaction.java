package com.dj.model;

import java.sql.Timestamp;

public class Transaction {
    private int id;
    private int accountId;
    private double amount;
    private String type;
    //DEPOSIT,WITHDRAWAL,TRASFER
    private Timestamp timestamp;

    public Transaction(int accountId,double amount,String type){
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
    }

    // the constructor for fetchings
    public Transaction(int id, int accountId, double amount, String type, Timestamp timestamp) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return String.format("[%s] %-12s: $%.2f | ID: %d", timestamp, type, amount, id);
    }
    
}
