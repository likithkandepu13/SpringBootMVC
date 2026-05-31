package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository urepo;

    public String addUser(String email, String password)
    {
        User existing = urepo.findByUemail(email);

        if(existing != null)
        {
            return "Email already exists";
        }

        User u = new User();
        u.setUemail(email);
        u.setUpwd(password);

        urepo.save(u);

        return "Signup Success";
    }

    public String loginUser(String email, String password)
    {
        User u = urepo.findByUemail(email);

        if(u != null && u.getUpwd().equals(password))
        {
            return "Login Success";
        }

        return "Invalid Email or Password";
    }
}