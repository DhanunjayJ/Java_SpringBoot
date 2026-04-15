package com.dj.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dj.model.Transaction;
import com.dj.util.DBConnection;

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

  public List<Transaction> getTransactionsByAccountId(int accountId){
    List <Transaction> transactions = new ArrayList<>();
    String sql = "SELECT * FROM transactions WHERE account_id = ? ORDER BY timestamp DESC";

    Connection conn = DBConnection.getConnection();

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
      
      pstmt.setInt(1,accountId);

      ResultSet rs = pstmt.executeQuery();

      while(rs.next()){
        transactions.add(new Transaction(rs.getInt("id"), 
                         rs.getInt("account_id"),
                         rs.getDouble("amount"),
                         rs.getString("type"),
                         rs.getTimestamp("timestamp")));
      }
    } catch(Exception e){
      e.printStackTrace();
    }

    return transactions;
  } 

  public List<Transaction> getAllTransaction(){

    List<Transaction> transactions = new ArrayList<>();
    String sql = "SELECT * FROME transactions";
    Connection conn = DBConnection.getConnection();

    try(PreparedStatement pstmt = conn.PreparedStatement(sql)){
      ResultSet rs = pstmt.executeQuery();
      while(rs.next()){
        transactions.add(new Transaction(
          rs.getInt("id"),
          rs.getInt("account_id");
          rs.getDouble("amount");
          rs.getString("type");
          rs.getTimestamp("timestamp");
        ));
      }
    } catch(SQLException e){
      e.printStackTrace();
    }
    
    return transactions;
  }
}
