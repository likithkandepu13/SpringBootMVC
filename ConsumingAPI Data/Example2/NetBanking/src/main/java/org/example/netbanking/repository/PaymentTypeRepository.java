package org.example.netbanking.repository;

import org.example.netbanking.enitity.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType,String> {
}

