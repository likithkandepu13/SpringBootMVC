package org.example.netbanking.service;

import org.example.netbanking.enitity.PaymentDetails;
import org.example.netbanking.enitity.PaymentType;
import org.example.netbanking.repository.PaymentRepository;
import org.example.netbanking.request.PaymentModel;
import org.example.netbanking.request.PaymentTypeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repo;

    public ResponseEntity<String> addPayment(PaymentModel model) {

        PaymentDetails payment = new PaymentDetails();
        payment.setUsername(model.getUsername());
        payment.setAmount(model.getAmount());

        PaymentType type = new PaymentType();
        type.setPaymenttype(model.getPaymentType().getPaymenttype());

        payment.setPaymentType(type);

        repo.save(payment);

        return ResponseEntity.status(201).body("Payment Successful");
    }

    public ResponseEntity<List<PaymentModel>> getAllPayments() {

        List<PaymentDetails> payments = repo.findAll();

        List<PaymentModel> response = new ArrayList<>();

        for (PaymentDetails payment : payments) {

            PaymentModel model = new PaymentModel();
            model.setUsername(payment.getUsername());
            model.setAmount(payment.getAmount());

            PaymentTypeModel typeModel = new PaymentTypeModel();
            typeModel.setPaymenttype(payment.getPaymentType().getPaymenttype());

            model.setPaymentType(typeModel);

            response.add(model);
        }

        return ResponseEntity.ok(response);
    }
}