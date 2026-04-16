package com.dj.model;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(int userId,double balance){
        super(userId, balance, "SAVINGS");
    }

    public SavingsAccount(int id,int userId,double balance){
        super(id,userId,balance,"SAVINGS");
    }

    @Override
    public void calculateInterest(){
        //saving grow by 4%
        this.balance += this.balance*0.04;
    }
}
