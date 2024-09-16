package com.practica.java2023.repository;

import com.practica.java2023.model.Event;

import com.practica.java2023.service.EventService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    //List<Event> findAll();

    @Query("Select e from Events e")
    public List<Event> findAllEvents();

    List<Event> findEventsByVenueIDAndEventTypeID();

}
