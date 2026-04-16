package com.dj.model;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(int userId,double balance){
        super(userId,balance,"CURRENT");
    } 

    public CurrentAccount(int id,int userId,double balance){
        super(id,userId,balance,"CURRENT");
    }

    @Override
    public void calculateInterest() {
        System.out.println("No Interest for Current Accounts");
    }

}