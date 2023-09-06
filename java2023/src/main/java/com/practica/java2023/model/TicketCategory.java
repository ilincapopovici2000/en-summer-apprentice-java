package com.practica.java2023.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategories")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;

    @Column(name = "price")
    private Float price;

    @Column(name = "description")
    private String description;

    public TicketCategory() {

    }

    public TicketCategory(Event event, Float price, String description) {
        this.event = event;
        this.price = price;
        this.description = description;
    }

    public long getId() {
        return ticketCategoryID;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ticket Category [id=" + ticketCategoryID + ", event=" + event + ", price=" + price + ", description=" + description + "]";
    }

}
