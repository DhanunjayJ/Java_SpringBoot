package com.dj.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.dj.exception.InsufficientFundsException;
import com.dj.model.BankAccount;
import com.dj.model.Transaction;
import com.dj.model.User;
import com.dj.repository.AccountRepository;
import com.dj.repository.TransactionRepository;
import com.dj.repository.UserRepository;
import com.dj.util.DBConnection;

public class BankingService {
    private UserRepository userRepository = new UserRepository();
    private AccountRepository accountRepo = new AccountRepository();
    private TransactionRepository transRepo = new TransactionRepository();

    public boolean registerUser(String username,String password){
        User user = new User(username,password);
        boolean isRegistered = userRepository.register(user);
        return isRegistered;
    }

    public User login(String username,String password){
        User user = userRepository.login(username, password);
        return user;
    }

    public BankAccount getAccountByUserId(int id){
        BankAccount account = accountRepo.getAccountByUserId(id);
        return account;
    }

    public boolean createAccount(BankAccount account){
        return accountRepo.createAccount(account);
    }

    public void deposit(BankAccount account,double amount) throws Exception {
       
        if(amount<=0) throw new Exception ("Amount must be positive");

        Connection conn = DBConnection.getConnection();

        try {
            //Start a Transaction
            conn.setAutoCommit(false);
            //calculte and update balance
            double newBalance = account.getBalance() + amount;
            accountRepo.updateBalance(account.getId(), newBalance, conn);
            //log transaction
            Transaction t = new Transaction(account.getId(),amount,"DEPOSIT");
            transRepo.logTransaction(t, conn);
            //Commit both
            conn.commit();
            //update the local object
            account.setBalance(newBalance); 
            System.out.println("Deposit Sucessful");
        } catch(SQLException e){
            conn.rollback();
            throw new Exception("Transaction Failed : DataBase Error");
        } finally {
            //reset connection for next use;
            conn.setAutoCommit(true);
        }
    }

    public void withdraw(BankAccount account, double amount) throws Exception {
        if(amount<=0) throw new Exception("Withdrawal amount must be positive");

        if(account.getBalance()<amount){
            throw new InsufficientFundsException("Insufficient Funds, You only have "+ account.getBalance());
        }

        Connection conn = DBConnection.getConnection();

        try{
            conn.setAutoCommit(false);
            
            double newBalance = account.getBalance()-amount;
            accountRepo.updateBalance(account.getId(), newBalance, conn);

            Transaction t = new Transaction(account.getId(), amount,"WITHDRAWAL");
            transRepo.logTransaction(t, conn);

            conn.commit();
            account.setBalance(newBalance);
            
        }catch(SQLException e){

            conn.rollback();
            throw new Exception("Database Error during withdrawal");

        } finally {

            conn.setAutoCommit(true);

        }
    }
}
