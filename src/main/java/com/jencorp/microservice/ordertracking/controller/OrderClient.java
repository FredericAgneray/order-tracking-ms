package com.jencorp.microservice.ordertracking.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jencorp.microservice.ordertracking.model.Order;

@FeignClient(value = "order", url = "http://jencorp-order-sys-api.us-e2.cloudhub.io/")
//@FeignClient(value = "order", url = "localhost:8081")

public interface OrderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/orders")
    List<Order> getOrders(@RequestParam String customerId);
    
}
