package com.practica.java2023.service;

import com.practica.java2023.model.Order;
import com.practica.java2023.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@NoArgsConstructor
@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll(){
        return orderRepository.findAllOrders();
    }

    public Order findOrderByID(Integer orderID){
        return orderRepository.findOrderById(orderID);
    }
}
