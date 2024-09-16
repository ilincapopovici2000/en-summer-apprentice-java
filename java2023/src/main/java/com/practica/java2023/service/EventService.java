package com.practica.java2023.service;

import com.practica.java2023.model.Event;
import com.practica.java2023.repository.EventRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@NoArgsConstructor
@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    public List<Event> findAll(){
        return eventRepository.findAllEvents();
    }

    public List<Event> findEventsByVenueIDAndEventTypeID(){
        return eventRepository.findEventsByVenueIDAndEventTypeID();
    }
}
