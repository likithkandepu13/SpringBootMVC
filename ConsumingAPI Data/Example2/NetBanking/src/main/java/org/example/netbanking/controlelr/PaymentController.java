package org.example.netbanking.controlelr;

import org.example.netbanking.request.PaymentModel;
import org.example.netbanking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    PaymentService service;

    @PostMapping("/payment")
    public ResponseEntity<String> paymentDetails(@RequestBody PaymentModel pm)
    {
        return service.addPayment(pm);
    }
    @GetMapping("/getpaymentdetails")
    public ResponseEntity<List<PaymentModel>> getPaymentDetails()
    {
        return service.getAllPayments();
    }
}
