package com.dj.model;

public abstract class BankAccount {
    protected int id;
    protected int userId;
    protected double balance;
    protected String accountType;

    // Constructor for New Accounts (No Id yet) Id is Auto Incrmeneted 
    //in the Database
    public BankAccount(int userId, double balance, String accountType) {
        this.userId = userId;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Constructor for EXISTING accounts (Fetching from Neon)
    public BankAccount(int id, int userId, double balance, String accountType) {
        this.id = id;
        this.userId = userId;
        this.balance = balance;
        this.accountType = accountType;
    }


    public int getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "BankAccount [id=" + id + ", userId=" + userId + ", balance=" + balance + ", accountType=" + accountType
                + "]";
    }

    // Abstract method: Every account must define its own interest logic
    public abstract void calculateInterest();

    public int getId() {
        return id;
    }

}
