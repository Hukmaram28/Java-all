package com.stackroute.model;


import org.springframework.stereotype.Component;

@Component
public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;
}