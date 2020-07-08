package com.jencorp.microservice.ordertracking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jencorp.microservice.ordertracking.model.Contact;
import com.jencorp.microservice.ordertracking.model.Order;
import com.jencorp.microservice.ordertracking.model.OrderTrack;

@RestController
public class OrderTrackingController {
	
	
    @GetMapping("/CompOrders/{contactId}")
    public ResponseEntity<?> findOrdersOfContact(@PathVariable Long contactId){
    	
    	Order order1 = new Order();
    	order1.setCustomerID("BSBEV");
    	order1.setOrderID("10289");
    	
    	Order order2 = new Order();
    	order2.setCustomerID("ISLAT");
    	order2.setOrderID("10315");
    	
    	Contact contact1 = new Contact();
    	contact1.setEmail("a_young@dickenson.com");
    	contact1.setName("Andy Young");
    	
    	OrderTrack orderTrack = new OrderTrack();
    	List<Order> orders = new ArrayList<Order>();
    	orders.add(order1);
    	orders.add(order2);
    	orderTrack.setOrders(orders);
    	orderTrack.setContact(contact1);
    	
    	return ResponseEntity.ok(orderTrack);
    }

}
