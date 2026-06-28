package org.example.netbanking.enitity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentid;

    private String username;

    private int amount;

    @ManyToOne
    @JoinColumn(name = "payment_type")
    private PaymentType paymentType;
}