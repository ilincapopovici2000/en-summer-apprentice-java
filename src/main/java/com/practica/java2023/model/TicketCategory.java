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
@Table(name = "TicketCategories")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;

    @Column(name = "price")
    private Float price;

    @Column(name = "description")
    private String description;

    @Override
    public String toString() {
        return "Ticket Category [id=" + ticketCategoryID + ", event=" + event + ", price=" + price + ", description=" + description + "]";
    }

}
