package com.practica.java2023.repository;

import com.practica.java2023.model.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository extends CrudRepository<Venue, Long> {

}
