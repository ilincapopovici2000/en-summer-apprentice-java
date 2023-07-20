package com.practica.java2023.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Venues")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long venueID;

    @Column(name = "venueLocation")
    private String venueLocation;

    @Column(name = "venueType")
    private String venueType;

    @Column(name = "capacity")
    private String capacity;

    public Venue() {

    }

    public Venue(String venueLocation, String venueType, String capacity) {
        this.venueLocation = venueLocation;
        this.venueType = venueType;
        this.capacity = capacity;
    }

    public long getId() {
        return venueID;
    }

    public String getVenueLocation() {
        return venueLocation;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Venue [id=" + venueID + ", venueLocation=" + venueLocation + ", venueType=" + venueType +", capacity=" + capacity + "]";
    }

}

