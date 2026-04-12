package com.dj.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dj.model.User;
import com.dj.util.DBConnection;

public class UserRepository {
    public boolean register(User user){

        String sql = "INSERT INTO users(username,password) VALUES (?,?)";
      
        Connection conn = DBConnection.getConnection();

        try(PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getPassword());
            
            return pstmt.executeUpdate() > 0;

        }catch(SQLException e){
            System.err.println("Regitration error:"+ e.getMessage());
            return false;
        }
    }

    public User login(String username,String password){
        String sql = "SELECT * FROM USERS WHERE username = ?";

        Connection conn = DBConnection.getConnection();

        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            
                pstmt.setString(1,username);
                ResultSet rs = pstmt.executeQuery();

                if(rs.next()){
                    String dbPassword = rs.getString("password");

                    if(dbPassword.equals(password)){
                        return new User(rs.getInt("id"),rs.getString("username"),dbPassword);
                    }else{
                        System.out.println("Invalid password");
                    }
                }else{
                    System.out.println("Username not found");
                }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
