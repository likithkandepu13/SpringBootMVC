package org.example.queryparams.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.example.queryparams.entity.User;
import org.example.queryparams.model.UserModel;
import org.example.queryparams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping(path = "/adduser")
    public String addUSer( @Valid @RequestBody UserModel um)
    {
        return service.addUSers(um);
    }

    @GetMapping(path = "/getusers")
    public List<User> getAllUser()
    {
        return service.getUsers();
    }

    @GetMapping(path = "/getusers/{email}")
    public List<User> getAllUserByEmail(@PathVariable("email") String email)
    {
        return service.getUsersByEmail(email);
    }


    @GetMapping(path = "/getusers/serach")
    public List<User> getAllUserByEmail(@RequestParam("country") String country, @RequestParam("city") String city)
    {
        return service.getUsersByCityandCountry(city,country);
    }


}
