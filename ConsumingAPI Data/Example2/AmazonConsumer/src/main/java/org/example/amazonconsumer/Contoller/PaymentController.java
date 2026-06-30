package org.example.amazonconsumer.Contoller;

import org.example.amazonconsumer.Model.PaymentModel;
import org.example.amazonconsumer.service.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<PaymentModel> getPayments()
    {
        return service.getAllPayments();
    }

    @GetMapping("getpayment/{id}")
    public String getpaymentByid(@PathVariable("id") int id)
    {
        return service.getPaymentId(id);
    }

    @GetMapping("getpaymentdetails")
    public String getPaymentByIDandType(@RequestParam("id") int id, @RequestParam("type") String type)
    {
        return service.getPayemntBytypeandId(id,type);
    }
}
