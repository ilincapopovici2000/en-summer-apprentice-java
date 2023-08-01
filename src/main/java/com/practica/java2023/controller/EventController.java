package com.practica.java2023.controller;

import com.practica.java2023.Dto.EventDto;
import com.practica.java2023.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.practica.java2023.service.EventService;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("/allEvents")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> allEvents = eventService.findAll();
        return new ResponseEntity<>(allEvents, HttpStatus.OK);
    }

    @GetMapping("/eventsByVenueIDAndEventTypeName")
    public ResponseEntity<EventDto> getEventsByVenueIdAndEventType(@RequestParam Long venueID, @RequestParam String eventTypeName) {
        EventDto eventDto = eventService.findEventsByVenueIDAndEventTypeName(venueID, eventTypeName);
        return new ResponseEntity<>(eventDto, HttpStatus.OK);
    }

}
