package com.example.demo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private Date date;
    private String email;
    public String getUser(){
        return "User:\n" +
                "login=" + login + "\n" +
                "password=" + password + "\n" +
                "date=" + date + "\n" +
                "email=" + email + "\n";
    }
}
