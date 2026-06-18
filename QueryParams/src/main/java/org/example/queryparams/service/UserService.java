package org.example.queryparams.service;

import org.example.queryparams.entity.User;
import org.example.queryparams.model.UserModel;
import org.example.queryparams.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository urepo;

    public String addUSers(UserModel model)
    {
        User u = new User();
        u.setCity(model.getCity());
        u.setEmail(model.getEmail());
        u.setCountry(model.getCountry());
        u.setGender(model.getGender());
        u.setUsername(model.getUsername());
        urepo.save(u);
        if(u!=null)
        {
            return " inserted successfully";
        }
        return "failed";
    }

    public List<User> getUsers()
    {
     return urepo.findAll();
    }

    public List<User> getUsersByEmail(String email)
    {
        return urepo.findByEmail(email);
    }
    public List<User> getUsersByCityandCountry(String city,String country)
    {
        return urepo.findByCityAndCountry(city,country);
    }
}
