package com.jencorp.microservice.ordertracking.model;

import java.io.Serializable;

public class Contact implements Serializable {
	
	private static final long serialVersionUID = -3318547857751606948L;
	String name;
	String email;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
