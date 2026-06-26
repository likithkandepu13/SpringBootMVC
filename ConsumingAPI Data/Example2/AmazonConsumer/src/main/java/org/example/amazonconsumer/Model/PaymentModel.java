package org.example.amazonconsumer.Model;
import lombok.Data;

@Data
public class PaymentModel {
    private int paymentid;
    private String username;
    private int amount;
    private PaymentTypeModel paymentType;
}