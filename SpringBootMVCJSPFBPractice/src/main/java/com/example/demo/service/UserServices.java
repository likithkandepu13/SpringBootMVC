package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fbuser;
import com.example.demo.repository.FbuserRepository;

@Service
public class UserServices {

	@Autowired
	FbuserRepository frepo;
	public String addUser(String name,String email)
	{
		Fbuser f=frepo.findByEmail(email);
		if(f ==null)
		{
			Fbuser f1=new Fbuser();
			f1.setName(name);
			f1.setEmail(email);
			frepo.save(f1);
			return "User added successfuly";
		}
		return "Email existed";
	}
	public String checkUser(String name,String email)
	{
		Fbuser f=frepo.findByEmail(email);

	    if(f != null && f.getName().equals(name))
	    {
	        return "User signed in successfully";
	    }
	    return " fail";
	}
}
