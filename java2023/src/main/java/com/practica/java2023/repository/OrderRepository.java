package com.practica.java2023.repository;


import com.practica.java2023.model.Event;
import com.practica.java2023.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    //List<Order> findAll();

    Order findOrderById(Integer orderID);

    @Query("Select o from Orders o")
    public List<Order> findAllOrders();


}
