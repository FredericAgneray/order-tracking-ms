package com.jencorp.microservice.ordertracking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jencorp.microservice.ordertracking.model.Contact;
import com.jencorp.microservice.ordertracking.model.Order;
import com.jencorp.microservice.ordertracking.model.OrderTrack;

@RestController
public class OrderTrackingController {
	
    @Autowired
    private ContactClient contactClient;
	
    @Autowired
    private OrderClient orderClient;
    
    @GetMapping("/CompOrders/{contactId}")
    public ResponseEntity<?> findOrdersOfContact(@PathVariable String contactId){
    	
    	List<Contact> contacts = contactClient.getContacts(contactId);
    	
    	List<Order> orders = orderClient.getOrders(provideCustd());
    	
    	OrderTrack orderTrack = new OrderTrack();
    	orderTrack.setOrders(orders);
    	orderTrack.setContact(contacts.get(0));
    	
    	return ResponseEntity.ok(orderTrack);
    }
    
    private static String provideCustd(){
    	int time = (int)System.currentTimeMillis()%5;
    	switch (time) {
    	case 1:
    		return "RATTC";
    	case 2:
    		return "WHITC";
    	case 3:   		
    		return "SPLIR";
    	default:
    		return "THEBI";
    	}
    }

}
