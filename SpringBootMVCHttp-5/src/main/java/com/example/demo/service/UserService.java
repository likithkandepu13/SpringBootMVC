package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.UserRequest;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public String addUser(UserRequest req)
	{
		User u = new User();
		u.setUserid(req.getUserid());
		u.setAddress(req.getAddress());
		u.setPincode(req.getPincode());
		u.setUname(req.getUname());
		
		User saved = repo.save(u);
		if(saved!=null)
		{
			return "inserted successfully";
		}
		return "failed insertion";
	}

}
