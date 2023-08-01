package com.practica.java2023.controller;

import com.practica.java2023.Dto.EventDto;
import com.practica.java2023.Dto.OrderDto;
import com.practica.java2023.model.Event;
import com.practica.java2023.model.NewOrder;
import com.practica.java2023.model.Order;
import com.practica.java2023.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/allOrders")
    public ResponseEntity<Iterable<Order>> getAllOrders() {
        Iterable<Order> allOrders = orderService.findAll();
        System.out.println("Hello world");
        return new ResponseEntity<>(allOrders, HttpStatus.OK);
    }
    @GetMapping("/orders")
    public ResponseEntity<List<OrderDto>> getOrderByUserID(@RequestParam Long userID) {
        List<OrderDto> orderDto = orderService.findOrderByUserID(userID);
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

    @PostMapping("/addOrder")
    public ResponseEntity<OrderDto> addNewOrder(@RequestBody NewOrder newOrder){
        OrderDto orderDto = orderService.addOrder(newOrder);
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }
}
