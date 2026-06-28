package org.example.netbanking.repository;

import org.example.netbanking.enitity.PaymentDetails;
import org.example.netbanking.enitity.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<PaymentDetails,Integer> {
    Optional<PaymentDetails> findByPaymentidAndPaymentType_Paymenttype(
            int paymentid,
            String paymenttype);
}
