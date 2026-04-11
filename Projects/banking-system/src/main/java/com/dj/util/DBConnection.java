package com.dj.util;

import java.sql.*;

public class DBConnection{
    private static Connection connection = null;

    private DBConnection(){}

    public static Connection getConnection() {
        if(connection == null) {
            try {
                String url = "jdbc:postgresql://ep-divine-cherry-ambrxdhe-pooler.c-5.us-east-1.aws.neon.tech/neondb?sslmode=require&channel_binding=require";
                String uname = "neondb_owner";
                String pass = "npg_XIunGO9rF4DA";

                Class.forName("org.postgresql.Driver");

                connection = DriverManager.getConnection(url,uname,pass);
                System.out.println("Cloud Connection Sucessful");
            } catch (ClassNotFoundException | SQLException e){
                System.err.println("Cloud Connection Failed:" + e.getMessage());
            }
        }
        return connection;
    }
}