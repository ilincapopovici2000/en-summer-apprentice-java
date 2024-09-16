package com.practica.java2023.controller;

import com.practica.java2023.model.Event;
import com.practica.java2023.model.Order;
import com.practica.java2023.service.OrderService;
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
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/Orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> allOrders = orderService.findAll();
        System.out.println("Hello world");
        return new ResponseEntity<>(allOrders, HttpStatus.OK);
    }

    @GetMapping("/Orders/{orderID}")
    public ResponseEntity<Order> getOrderById(@PathVariable("orderID") Integer orderID) {
        Order order = orderService.findOrderByID(orderID);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

//    @PostMapping("/postOrders/{userID}")
//    public ResponseEntity<Order> addNewOrder(@PathVariable("userID") Integer userID){
//        orderService.addNewOrder(userID);
//        return new ResponseEntity<>(order, HttpStatus.OK);  //save order
//    }
}
