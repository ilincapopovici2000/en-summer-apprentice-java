package com.practica.java2023.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")
    private String email;

    @Override
    public String toString() {
        return "User [id=" + userid + ", userName=" + userName + ", email=" + email + "]";
    }

}
