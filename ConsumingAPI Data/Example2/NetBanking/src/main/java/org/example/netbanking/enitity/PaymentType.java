package org.example.netbanking.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PaymentType {

    private String paymenttype;

    @OneToMany(mappedBy = "paymentType")
    private List<PaymentDetails> details;
}