package org.example.netbanking.controlelr;

import org.example.netbanking.request.PaymentModel;
import org.example.netbanking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getallpaymentdetails")
    public ResponseEntity<List<PaymentModel>> getPaymentDetails()
    {
        return service.getAllPayments();
    }

    @GetMapping("getpaymentdetails/{id}")
    public ResponseEntity<PaymentModel> getAllByid(@PathVariable("id") int id)
    {
       return service.getById(id);
    }
    @GetMapping("getpaymentdetails")
    public ResponseEntity<PaymentModel> getAllByidAndPayemntType(@RequestParam("id") int id,@RequestParam("type") String type)
    {
        return service.getByIdAndType(id,type);
    }
}
