package com.practica.java2023.repository;


import com.practica.java2023.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findAll();

    List<Order> findOrdersByUser_Userid(Long userID);

}
