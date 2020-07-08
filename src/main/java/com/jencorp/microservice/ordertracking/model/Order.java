package com.jencorp.microservice.ordertracking.model;

import java.io.Serializable;

public class Order implements Serializable {
	
	private static final long serialVersionUID = 6161104516504630006L;
	String OrderID;
	String CustomerID;
	
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	
	   
	
}
