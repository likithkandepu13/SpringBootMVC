package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.LoginRequest;
import com.example.demo.request.UserRequest;
import com.example.demo.response.UserResponse;


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
	
	public com.example.demo.response.UserResponse checkLogin(LoginRequest req)
	{
	    User u = repo.findByUseridAndUname(req.getUserid(), req.getUname());

	    if(u != null)
	    {
	    	UserResponse res = new UserResponse();
	        res.setUserid(u.getUserid());
	        res.setUname(u.getUname());
	        res.setAddress(u.getAddress());
	        res.setPincode(u.getPincode());	       
	        return res;
	    }

	    return null;
	}

}
