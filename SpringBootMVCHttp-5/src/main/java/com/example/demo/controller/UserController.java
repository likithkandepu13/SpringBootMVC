package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.UserRequest;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping(path = "/adduser") // we can use consumes if we want to specify which jason or xml thats going to come here
	public String addUser(@RequestBody UserRequest req )
	{
		System.out.println(req);
		return service.addUser(req);
	}

}
