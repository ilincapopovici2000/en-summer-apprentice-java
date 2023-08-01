package com.practica.java2023.service;

import com.practica.java2023.Dto.EventDto;
import com.practica.java2023.Dto.TicketCategoryDto;
import com.practica.java2023.model.Event;
import com.practica.java2023.model.TicketCategory;
import com.practica.java2023.repository.EventRepository;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
import com.practica.java2023.repository.TicketCategoryRepository;
import com.practica.java2023.repository.VenueRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    public List<Event> findAll(){
        return eventRepository.findAll();
    }

    public EventDto findEventsByVenueIDAndEventTypeName(Long venueID, String eventTypeName){
        Event e = eventRepository.findEventsByVenue_VenueIDAndEventType_EventTypeName(venueID, eventTypeName);
        List<TicketCategory> ticketCategory = ticketCategoryRepository.findTicketCategoriesByEvent_EventID(e.getEventID());
        List<TicketCategoryDto> ticketCategoryDto = new ArrayList<>();
        for(TicketCategory i: ticketCategory){
            ticketCategoryDto.add(new TicketCategoryDto(i.getTicketCategoryID(), i.getDescription(), i.getPrice()));
        }
        return new EventDto(e.getEventID(), e.getVenue(), e.getEventType().getEventTypeName(), e.getEventDescription(), e.getEventName(), e.getStartDate(), e.getEndDate(), ticketCategoryDto);

    }
}
