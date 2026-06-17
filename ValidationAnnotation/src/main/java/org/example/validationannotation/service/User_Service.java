package org.example.validationannotation.service;

import org.example.validationannotation.entity.Address;
import org.example.validationannotation.entity.User;
import org.example.validationannotation.model.Address_model;
import org.example.validationannotation.model.User_model;
import org.example.validationannotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class User_Service
{
    @Autowired
    UserRepository urepo;
    public String adduser(User_model um) {
        User u = new User();
        u.setUsername(um.getUsername());
        u.setUser_phone(um.getUser_phone());

        List<Address_model> modelList = um.getUser_address();
        List<Address> addressList = new ArrayList<>();

        for (Address_model am : modelList) {
            Address a = new Address();
            a.setStreet(am.getStreet());
            a.setCity(am.getCity());
            a.setState(am.getState());
            a.setCountry(am.getCountry());
            addressList.add(a);
        }
//        List<Address> addressList = um.getUser_address().stream()
//                .map(am -> {
//                    Address a = new Address();
//                    a.setStreet(am.getStreet());
//                    a.setCity(am.getCity());
//                    a.setState(am.getState());
//                    a.setCountry(am.getCountry());
//                    return a;
//                })
//                .collect(Collectors.toList());
//
//        u.setUser_address(addressList);

        u.setUser_address(addressList);

        try {
            urepo.save(u);
            return "insertion successful";
        } catch (Exception e) {
            return "insertion failed";
        }
    }
    public String userSignin(User_model um)
    {
        User u = urepo.findByUsername(um.getUsername());
        if (u != null && u.getUser_phone() == um.getUser_phone()) {
            return "Login successful";
        }
        return "Failed";
    }
}
