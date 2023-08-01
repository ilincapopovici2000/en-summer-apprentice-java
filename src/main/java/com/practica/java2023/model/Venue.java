package com.practica.java2023.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Venues")
public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venueID;

    @Column(name = "venueLocation")
    private String venueLocation;

    @Column(name = "venueType")
    private String venueType;

    @Column(name = "capacity")
    private String capacity;

    @Override
    public String toString() {
        return "Venue [id=" + venueID + ", venueLocation=" + venueLocation + ", venueType=" + venueType +", capacity=" + capacity + "]";
    }

}

