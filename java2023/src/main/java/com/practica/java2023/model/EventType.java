package com.practica.java2023.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;


    public EventType() {

    }

    public EventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public long getId() {
        return eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    @Override
    public String toString() {
        return "EventType [id=" + eventTypeID + ", eventTypeName=" + eventTypeName + "]";
    }

}
