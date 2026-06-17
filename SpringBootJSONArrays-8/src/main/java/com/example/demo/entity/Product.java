package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prodcut_info")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productname;
    private int price;
    private String specification;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getProductname() { return productname; }
    public void setProductname(String productname) { this.productname = productname; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public String getSpecification() { return specification; }
    public void setSpecification(String specification) { this.specification = specification; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}