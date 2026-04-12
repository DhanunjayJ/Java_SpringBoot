package com.dj.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dj.model.Transaction;

public class TransactionRepository {
    
  public boolean logTransaction(Transaction transaction, Connection conn){
    String sql = "INSERT INTO  transactions (account_id,amount,type) VALUES (?,?,?)";
    
    try(PreparedStatement pstmt = conn.prepareStatement(sql)){
    
        pstmt.setInt(1,transaction.getAccountId());
        pstmt.setDouble(2,transaction.getAmount());
        pstmt.setString(3,transaction.getType());

        return pstmt.executeUpdate() > 0;

    }catch (SQLException e){

        e.printStackTrace();
        return false;

    }
  }  
}
