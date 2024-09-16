package com.practica.java2023.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderID;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;

    @Column(name = "orderedAt")
    private LocalDateTime orderedAt;

    @Column(name = "numberOfTickets")
    private int numberOfTickets;

    @Column(name = "totalPrice")
    private Float totalPrice;

    public Order() {

    }

    public Order(User user, TicketCategory ticketCategory, LocalDateTime orderedAt, int numberOfTickets, Float totalPrice) {
        this.user = user;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public long getId() {
        return orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setEmail(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    @Override
    public String toString() {
        return "Order [id=" + orderID + ", user=" + user + ", ticketCategory=" + ticketCategory+ ", orderedAt=" + orderedAt + ", numberOfTickets=" + numberOfTickets+ ", totalPrice=" + totalPrice + "]";
    }

}

