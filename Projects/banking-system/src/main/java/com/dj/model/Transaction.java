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
    
}
