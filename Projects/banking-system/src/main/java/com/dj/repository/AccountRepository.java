package com.dj.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.spi.CurrencyNameProvider;

import com.dj.model.BankAccount;
import com.dj.model.SavingsAccount;
import com.dj.model.CurrentAccount;
import com.dj.util.DBConnection;

public class AccountRepository {

    public boolean createAccount (BankAccount account){
        String sql = "INSERT INTO accounts (user_id,account_type,balance) VALUES (?,?,?)";
        Connection conn = DBConnection.getConnection();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,account.getUserId());
            pstmt.setString(2,account.getAccountType());
            pstmt.setDouble(3,account.getBalance());
            return pstmt.executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public BankAccount getAccountByUserId(int userId){
        String sql = "SELECT * FROM accounts where user_id = ?";
        Connection conn = DBConnection.getConnection();
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,userId);
            ResultSet res = pstmt.executeQuery();
            if(res.next()){
                String type = res.getString("account_type");
                if(type.equals("SAVINGS")){
                    return new SavingsAccount(res.getInt("id"),res.getInt("user_id"),res.getDouble("balance"));
                }else{
                    return new CurrentAccount(res.getInt("id"),res.getInt("user_id"),res.getDouble("balance"));
                }
            }
        return null;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
