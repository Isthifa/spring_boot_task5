package com.isthifa.multithreading.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uName;
    private String uMail;
    public User()
    {

    }

    public User(String uName, String uMail) {
        this.uName = uName;
        this.uMail = uMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + id +
                ", Name='" + uName + '\'' +
                ", Mail='" + uMail + '\'' +
                '}';
    }
}
