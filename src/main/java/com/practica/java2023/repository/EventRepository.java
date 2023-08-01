package com.practica.java2023.repository;

import com.practica.java2023.model.Event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {


    List<Event> findAll();

    ResponseEntity<Event> findEventByeventID(Long eventID);

    Event findEventsByVenue_VenueIDAndEventType_EventTypeName(Long venueID, String eventTypeName);
}
