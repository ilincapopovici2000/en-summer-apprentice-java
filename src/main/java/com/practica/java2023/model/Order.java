package com.practica.java2023.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;

    @Column(name = "orderedAt")
    private LocalDateTime orderedAt;

    @Column(name = "numberOfTickets")
    private Integer numberOfTickets;

    @Column(name = "totalPrice")
    private Float totalPrice;

    public Order(User user, TicketCategory ticketCategory, LocalDateTime orderedAt, Integer numberOfTickets, Float totalPrice) {
        this.user = user;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }


    @Override
    public String toString() {
        return "Order [id=" + orderID + ", user=" + user + ", ticketCategory=" + ticketCategory+ ", orderedAt=" + orderedAt + ", numberOfTickets=" + numberOfTickets+ ", totalPrice=" + totalPrice + "]";
    }

}

