package com.practica.java2023.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Events")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventID;

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

    @Override
    public String toString() {
        return "Event [event=" + eventID + ", venue=" + venue + ", eventType=" + eventType + ", eventName=" + eventName + ", startDate=" + startDate + ", endDate=" + endDate + ", eventDescription=" + eventDescription + "]";
    }

}
