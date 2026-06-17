package com.example.demo.service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Order;
import com.example.demo.entity.Product;
import com.example.demo.repository.OrderRepo;
import com.example.demo.request.OrderRequest;
import com.example.demo.response.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    OrderRepo repo;

    public List<OrderResponse> getOrders() {
        List<OrderResponse> l1 = new ArrayList<>();
        try {
            List<Order> list = repo.findAll();
            System.out.println("Number of orders found: " + list.size());   // ADD THIS

            for (Order o : list) {
                OrderResponse res = new OrderResponse();
                res.setName(o.getName());
                res.setEmail(o.getEmail());
                res.setMobile(o.getMobile());
                res.setTotalamount(o.getTotalamount());
                res.setPayment_status(o.getPayment_status());
                l1.add(res);
            }
        } catch (Exception e) {
            e.printStackTrace();   // CHANGE THIS from System.out.println(e.getMessage())
        }
        return l1;
    }

    public String createOrder(@RequestBody OrderRequest req) {
        try {
            Order order = new Order();
            order.setName(req.getName());
            order.setEmail(req.getEmail());
            order.setMobile(req.getMobile());
            order.setTotalamount(req.getTotalamount());
            order.setPayment_status(req.getPayment_status());

            Address addr = new Address();
            addr.setStreet_name(req.getDeliveryaddress().getStreet_name());
            addr.setBuilding_name(req.getDeliveryaddress().getBuilding_name());
            addr.setFlat_np(req.getDeliveryaddress().getFlat_np());
            addr.setCity(req.getDeliveryaddress().getCity());
            addr.setPicode(req.getDeliveryaddress().getPicode());
            order.setDeliveryaddress(addr);
            List<Product> products = req.getProfuctinfo().stream().map(p -> {
                Product pi = new Product();
                pi.setProductname(p.getProductname());
                pi.setPrice(p.getPrice());
                pi.setSpecification(p.getSpecification());
                pi.setOrder(order);   // ← this was missing, add it back
                return pi;
            }).collect(Collectors.toList());
            order.setProfuctinfo(products);

            System.out.println("About to save order: " + order.getName());
            Order saved = repo.save(order);
            System.out.println("SAVE RETURNED, id = " + saved.getId());
            return "created successfully, id=" + saved.getId();

        } catch (Exception e) {
            return "failed: " + e.getMessage();
        }
    }
}