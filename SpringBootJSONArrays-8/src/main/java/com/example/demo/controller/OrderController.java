package com.example.demo.controller;

import com.example.demo.response.OrderResponse;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.example.demo.request.OrderRequest;

import java.util.List;

@RestController
public class OrderController {

	@Autowired
	OrderService service;
	@PostMapping(path = "/createorder")
	public String createOrder(@RequestBody OrderRequest req)
	{
		return service.createOrder(req);

	}

	@Transactional
	@GetMapping(path = "/getorder")
	public List<OrderResponse> getAllOrders()
	{
		return service.getOrders();
	}
}
