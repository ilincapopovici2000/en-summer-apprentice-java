package com.practica.java2023.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketCategoryDto {
    private Long ticketCategoryID;
    private String description;
    private Float price;
}
