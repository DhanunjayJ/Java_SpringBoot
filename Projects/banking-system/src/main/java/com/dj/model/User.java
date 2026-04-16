package com.dj.model;

public class User {
    private int id;
    private String username;
    private String password;

// Constructor 1: For Registration (ID is not known yet)
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Constructor 2: For Login/Fetching (ID is retrieved from Neon)
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }

}
