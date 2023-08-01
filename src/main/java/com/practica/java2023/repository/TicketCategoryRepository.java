package com.practica.java2023.repository;

import com.practica.java2023.model.Order;
import com.practica.java2023.model.TicketCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Long> {


    List<TicketCategory> findAll();

    List<TicketCategory> findTicketCategoriesByEvent_EventID(Long eventID);

    TicketCategory findTicketCategoryByTicketCategoryID(Long ticketCategoryID);
}
