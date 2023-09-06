package com.practica.java2023.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Events")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventID;

    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;

    @Column(name = "eventDescription")
    private String eventDescription;

    public Event() {

    }

    public Event(Venue venue, EventType eventType, String eventName, LocalDateTime startDate, LocalDateTime endDate, String eventDescription) {
        this.venue = venue;
        this.eventType = eventType;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventDescription = eventDescription;
    }

    public long getId() {
        return eventID;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventTypeID() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "Event [event=" + eventID + ", venue=" + venue + ", eventType=" + eventType + ", eventName=" + eventName + ", startDate=" + startDate + ", endDate=" + endDate + ", eventDescription=" + eventDescription + "]";
    }

}
