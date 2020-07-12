package com.jencorp.microservice.ordertracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderTrackingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OrderTrackingApplication.class, args);
	}


}
