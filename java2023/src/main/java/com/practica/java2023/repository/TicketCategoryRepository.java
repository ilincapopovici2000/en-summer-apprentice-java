package com.practica.java2023.repository;

import com.practica.java2023.model.Event;

import com.practica.java2023.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Integer> {

    List<TicketCategory> findAllByticketCategoryID(Integer ticketCategoryID);

}
