package com.practica.java2023.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userid;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")
    private String email;

    public User() {

    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public long getId() {
        return userid;
    }

    public String getUserNameName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + userid + ", userName=" + userName + ", email=" + email + "]";
    }

}
