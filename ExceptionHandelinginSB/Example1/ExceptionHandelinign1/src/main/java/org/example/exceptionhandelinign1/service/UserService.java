package org.example.exceptionhandelinign1.service;

import org.example.exceptionhandelinign1.entity.UserInfo;
import org.example.exceptionhandelinign1.model.UserModel;
import org.example.exceptionhandelinign1.respository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public ResponseEntity<String> addUser(UserModel m) {
        UserInfo i=new UserInfo();
        try{
        i.setUsername(m.getUsername());
        i.setPassword(m.getPassword());
        i.setEmail(m.getEmail());
        repo.save(i);
            return ResponseEntity.ok("\"user added succesfully\"");
        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());

        }

    }
}
