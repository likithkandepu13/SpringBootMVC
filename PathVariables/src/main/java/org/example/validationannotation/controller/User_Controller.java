package org.example.validationannotation.controller;

import jakarta.validation.Valid;
import org.example.validationannotation.entity.User;
import org.example.validationannotation.model.User_model;
import org.example.validationannotation.service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class User_Controller
{
    @Autowired
    User_Service service;

    @PostMapping(path = "/adduser")
    public String addUser(@RequestBody User_model user)
    {
       return service.adduser(user);
    }

    @GetMapping(path = "/userlogin")
    public String userSignin( @Valid @RequestBody User_model user)
    {
        return service.userSignin(user);
        //added commit change
    }

    @GetMapping(path = "/getuser/{username}")
    public User getUserbyName(@PathVariable("username") String username)
    {
        return service.getUser(username);
    }
}
