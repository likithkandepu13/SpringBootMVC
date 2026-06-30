package org.example.exceptionhandelinign1.controller;

import jakarta.validation.Valid;
import org.example.exceptionhandelinign1.model.UserModel;
import org.example.exceptionhandelinign1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/adduser")
    public ResponseEntity<String> addUSer(@Valid @RequestBody UserModel m)
    {
        return service.addUser(m);
    }

}
