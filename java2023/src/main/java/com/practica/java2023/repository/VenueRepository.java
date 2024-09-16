package com.practica.java2023.repository;

import com.practica.java2023.model.Venue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VenueRepository extends CrudRepository<Venue, Integer> {

    List<Venue> findAllByvenueID(Integer venueID);

}
