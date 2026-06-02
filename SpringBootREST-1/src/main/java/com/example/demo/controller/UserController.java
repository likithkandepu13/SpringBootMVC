package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	//in only controller we have to use the @Responsebody where we need to use this to get the main one
	@RequestMapping(value = "/welcome",method = RequestMethod.GET)
	public String writeEmp()
	{
		return "welcome to home page";
	}
}
