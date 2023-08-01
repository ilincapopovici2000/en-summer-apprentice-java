package com.practica.java2023.service;

import com.practica.java2023.Dto.OrderDto;
import com.practica.java2023.Dto.TicketCategoryDto;
import com.practica.java2023.model.*;
import com.practica.java2023.repository.EventRepository;
import com.practica.java2023.repository.OrderRepository;
import com.practica.java2023.repository.TicketCategoryRepository;
import com.practica.java2023.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

import static java.time.LocalDateTime.now;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Order> findAll(){ return orderRepository.findAll();}

    public List<OrderDto> findOrderByUserID(Long userID){
        List<Order> orders = new ArrayList<>();
        List<OrderDto> ordersDto = new ArrayList<>();
        orderRepository.findOrdersByUser_Userid(userID).forEach(o->orders.add(o));
        for(Order o: orders){
            ordersDto.add(new OrderDto(o.getTicketCategory().getEvent().getEventID(), o.getOrderedAt(), o.getTicketCategory().getTicketCategoryID(), o.getNumberOfTickets(), o.getTotalPrice()));
        }
        return ordersDto;
    }

    public OrderDto addOrder(NewOrder newOrder){
        LocalDateTime orderedAt = LocalDateTime.now();
        TicketCategory ticketcategory = ticketCategoryRepository.findById(newOrder.getTicketCategoryId()).get();
        User user = userRepository.findById(Long.valueOf(1)).get();
        Float totalPrice = newOrder.getNumberOfTickets()*ticketcategory.getPrice();
        Order deliverOrder = new Order(user, ticketcategory, orderedAt, newOrder.getNumberOfTickets(), totalPrice);
        Order order = orderRepository.save(deliverOrder);
        return new OrderDto(order.getTicketCategory().getEvent().getEventID(), order.getOrderedAt(), order.getTicketCategory().getTicketCategoryID(), order.getNumberOfTickets(), order.getTotalPrice());
    }

}