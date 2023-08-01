package com.practica.java2023.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long eventID;
    private LocalDateTime orderedAt;
    private Long ticketCategoryID;
    private Integer numberOfTickets;
    private Float totalPrice;


}
