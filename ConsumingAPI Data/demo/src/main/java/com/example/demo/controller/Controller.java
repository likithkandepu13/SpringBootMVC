package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller
{
    @PostMapping("/payment/upi")
    public String UpipaymentService()
    {
        return "payment successful by upi";
    }
    @PostMapping("/payment/card")
    public String cardPayment()
    {
        return "payment successful by card";
    }

    @GetMapping("/payment")
    public List<String> paymentTypes()
    {
        return List.of("card,upi,netbanking");
    }
}
