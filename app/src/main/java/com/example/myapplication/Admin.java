package com.example.myapplication;

public class Admin {
    private int id;
    private String username;
    private String password;

    public Admin(String id, String username, String password) {
        this.id = Integer.parseInt(id);
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}