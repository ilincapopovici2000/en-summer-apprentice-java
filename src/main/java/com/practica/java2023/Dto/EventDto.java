package com.practica.java2023.Dto;

import com.practica.java2023.model.Venue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private Long eventID;
    private Venue venue;
    private String type;
    private String description;
    private String name;
    private LocalDateTime startDate ;
    private LocalDateTime endDate;
    private List<TicketCategoryDto> ticketCategory;
}
