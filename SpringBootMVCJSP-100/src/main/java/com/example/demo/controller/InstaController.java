package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstaController {
	
	@GetMapping("/welcome")
	public String saywelcome()
	{
		return "insta";
	}

}
