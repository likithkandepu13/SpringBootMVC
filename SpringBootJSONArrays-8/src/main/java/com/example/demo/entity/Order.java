package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private long mobile;
    private int totalamount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> profuctinfo;

    @OneToOne(cascade = CascadeType.ALL)
    private Address deliveryaddress;
    private String Payment_status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public List<Product> getProfuctinfo() {
        return profuctinfo;
    }

    public void setProfuctinfo(List<Product> profuctinfo) {
        this.profuctinfo = profuctinfo;
    }

    public Address getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(Address deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public String getPayment_status() {
        return Payment_status;
    }

    public void setPayment_status(String payment_status) {
        Payment_status = payment_status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }
}