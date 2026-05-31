package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Fbuser;
import com.example.demo.service.UserServices;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	@Autowired
	UserServices us;
	@RequestMapping(value = "/main",method = RequestMethod.GET)
	public ModelAndView openFb()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("fb");
		return mv;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping(value = "/signup",method = RequestMethod.GET)
	public ModelAndView signUp()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("siginup");
		return mv;
	}
	@RequestMapping(value = "/Usersignup", method = RequestMethod.POST)
	public ModelAndView signUpUser(HttpServletRequest req) {

	    String name = req.getParameter("name");
	    String email = req.getParameter("email");

	    String msg = us.addUser(name, email);

	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("siginup");
	    mv.addObject("msg", msg);

	    return mv;
	}

	@RequestMapping(value = "/Userlogin", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpServletRequest req) {

	    String name = req.getParameter("name");
	    String email = req.getParameter("email");

	    String msg = us.checkUser(name, email);

	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("login");
	    mv.addObject("msg", msg);

	    return mv;
	}
	
	
}
