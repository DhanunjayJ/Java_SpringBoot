package com.dj.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public boolean updateBalance(int accountId,double newBalance,Connection conn) throws SQLException{
        String sql = "UPDATE accounts SET balance = ? WHERE id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setDouble(1, newBalance);
            pstmt.setInt(2,accountId);
            return pstmt.executeUpdate() > 0;
        }
    }

    public List<BankAccount> getAllAccounts(){
        List<BankAccount> accounts = new ArrayList<>();
        String sql = "SELECT * FROM accounts";
        Connection conn = DBConnection.getConnection();

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String type = rs.getString("account_type");
                int id = rs.getInt("id");
                int userId = rs.getInt("user_id");
                double balance = rs.getDouble("balance");

                if("SAVINGS".equalsIgnoreCase(type)){
                    accounts.add(new SavingsAccount(id, userId, balance));
                }else{
                    accounts.add(new CurrentAccount(id,userId, balance));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return accounts;
    }
}
