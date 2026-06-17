package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.CarRequest;

@RestController
public class CarController {
	
	@PostMapping(path ="/addcar")
	public CarRequest addUser(@RequestBody CarRequest req)
	{
		System.out.println(req);
		return req;
	}
}
