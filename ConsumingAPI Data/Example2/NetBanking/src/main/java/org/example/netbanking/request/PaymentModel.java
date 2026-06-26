package org.example.netbanking.request;

import lombok.Data;
import org.example.netbanking.enitity.PaymentType;

@Data
public class PaymentModel {
    private int paymentid;
    private String username;
    private int amount;
    private PaymentTypeModel paymentType;
}
