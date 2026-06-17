package com.example.demo.response;

import com.example.demo.entity.Address;
import com.example.demo.entity.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class OrderResponse {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String name;
        private String email;
        private long mobile;

        private int totalamount;
        private String Payment_status;


}
