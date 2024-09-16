package com.practica.java2023.controller;

import com.practica.java2023.model.Event;
import com.practica.java2023.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.practica.java2023.service.EventService;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/Events")
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> allEvents = eventService.findAll();
        System.out.println("Hello world");
        return new ResponseEntity<>(allEvents, HttpStatus.OK);
    }

//    @GetMapping("/Events/{eventID, eventTypeID}")
//    public ResponseEntity<List<Event>> getEventsByVenueIdAndEventType(@PathVariable("VenueID") Integer venueID, @PathVariable("EventTypeID") Integer EventTypeID) {
//        List<Event> allEvents = eventService.findEventsByVenueIDAndEventTypeID();
//        return new ResponseEntity<>(allEvents, HttpStatus.OK);
//    }
//
}
