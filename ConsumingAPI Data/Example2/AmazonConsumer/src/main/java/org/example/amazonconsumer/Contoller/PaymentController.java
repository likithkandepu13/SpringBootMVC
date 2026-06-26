package org.example.amazonconsumer.Contoller;

import org.example.amazonconsumer.Model.PaymentModel;
import org.example.amazonconsumer.service.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController
{
    //http://localhost:8080/payment
    @Autowired
    Paymentservice service;

    @PostMapping("/dopayment")
    public String doPayment(@RequestBody PaymentModel pm)
    {
       return service.doPayment(pm);
    }

    @GetMapping("getpaymentsfromapi")
    public String getPayments()
    {
        return service.getAllPayemnts();
    }
}
