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
@Table(name = "EventTypes")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;

    @Override
    public String toString() {
        return "EventType [id=" + eventTypeID + ", eventTypeName=" + eventTypeName + "]";
    }

}
