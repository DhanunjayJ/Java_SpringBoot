package com.dj.util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class DBInitializer {

    public static void init() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {
            
            // 1. Check if 'users' table already exists
            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "users", null);

            if (!tables.next()) {
                System.out.println("Tables not found. Initializing database...");

                // 2. Create Users Table
                stmt.execute("CREATE TABLE users (" +
                        "id SERIAL PRIMARY KEY, " +
                        "username VARCHAR(50) UNIQUE NOT NULL, " +
                        "password VARCHAR(100) NOT NULL)");

                // 3. Create Accounts Table
                stmt.execute("CREATE TABLE accounts (" +
                        "id SERIAL PRIMARY KEY, " +
                        "user_id INTEGER REFERENCES users(id), " +
                        "account_type VARCHAR(20) NOT NULL, " +
                        "balance DECIMAL(15, 2) DEFAULT 0.00)");

                // 4. Create Transactions Table
                stmt.execute("CREATE TABLE transactions (" +
                        "id SERIAL PRIMARY KEY, " +
                        "account_id INTEGER REFERENCES accounts(id), " +
                        "amount DECIMAL(15, 2) NOT NULL, " +
                        "type VARCHAR(20) NOT NULL, " +
                        "timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");

                System.out.println("Database tables created successfully!");
            } else {
                System.out.println("Database already initialized.");
            }

        } catch (Exception e) {
            System.err.println("Initialization Error: " + e.getMessage());
        }
    }
}