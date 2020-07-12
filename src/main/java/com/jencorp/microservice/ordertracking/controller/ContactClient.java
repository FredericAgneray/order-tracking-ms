package com.jencorp.microservice.ordertracking.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jencorp.microservice.ordertracking.model.Contact;


@FeignClient(value = "contact", url = "http://jencorp-contact-sys-api.us-e2.cloudhub.io/")
public interface ContactClient {
	
	
	// http://jencorp-contact-sys-api.us-e2.cloudhub.io/contacts?email=a_young@dickenson.com
    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    List<Contact> getContacts(@RequestParam String email);
    
}