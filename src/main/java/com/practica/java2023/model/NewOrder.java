package com.practica.java2023.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewOrder {
    private Long eventId;
    private Long ticketCategoryId;
    private Integer numberOfTickets;
}
