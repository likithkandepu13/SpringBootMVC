package org.example.netbanking.service;

import org.example.netbanking.enitity.PaymentDetails;
import org.example.netbanking.enitity.PaymentType;
import org.example.netbanking.repository.PaymentRepository;
import org.example.netbanking.repository.PaymentTypeRepository;
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

    @Autowired
    private PaymentTypeRepository paymentTypeRepo;

    public ResponseEntity<String> addPayment(PaymentModel model) {

        // Find existing PaymentType or create a new one
        PaymentType type = paymentTypeRepo
                .findById(model.getPaymentType().getPaymenttype())
                .orElseGet(() -> {
                    PaymentType newType = new PaymentType();
                    newType.setPaymenttype(model.getPaymentType().getPaymenttype());
                    return paymentTypeRepo.save(newType);
                });

        PaymentDetails payment = new PaymentDetails();
        payment.setUsername(model.getUsername());
        payment.setAmount(model.getAmount());
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

    public ResponseEntity<PaymentModel> getById(int id) {

        PaymentDetails payment = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment Not Found"));

        PaymentModel model = new PaymentModel();
        model.setUsername(payment.getUsername());
        model.setAmount(payment.getAmount());

        PaymentTypeModel typeModel = new PaymentTypeModel();
        typeModel.setPaymenttype(payment.getPaymentType().getPaymenttype());

        model.setPaymentType(typeModel);

        return ResponseEntity.ok(model);
    }

    public ResponseEntity<PaymentModel> getByIdAndType(int id, String type)
    {
        PaymentDetails payment= repo.findByPaymentidAndPaymentType_Paymenttype(id,type)
                .orElseThrow(() -> new RuntimeException("Payment Not Found"));
        PaymentModel model = new PaymentModel();
        model.setUsername(payment.getUsername());
        model.setAmount(payment.getAmount());

        PaymentTypeModel typeModel = new PaymentTypeModel();
        typeModel.setPaymenttype(payment.getPaymentType().getPaymenttype());

        model.setPaymentType(typeModel);

        return ResponseEntity.ok(model);

    }
}