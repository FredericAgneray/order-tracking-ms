package com.jencorp.microservice.ordertracking.model;

import java.io.Serializable;
import java.util.List;

public class OrderTrack implements Serializable {

	private static final long serialVersionUID = 2263495280562845492L;

	public List<Order> orders;
	
	public Contact contact;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
