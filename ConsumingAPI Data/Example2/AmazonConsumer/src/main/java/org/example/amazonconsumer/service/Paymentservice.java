package org.example.amazonconsumer.service;

import org.example.amazonconsumer.Model.PaymentModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class Paymentservice {
    public String doPayment(PaymentModel pm)
    {
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8080/payment";
        HttpEntity<PaymentModel> entity = new HttpEntity<>(pm);

        ResponseEntity<String> response= rt.exchange(url, HttpMethod.POST,entity,String.class);
        return response.getBody();
    }

    public String getAllPayemnts()
    {
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8080/getallpaymentdetails";

        ResponseEntity<String> response= rt.exchange(url,HttpMethod.GET,null,String.class);
        return response.getBody();
    }

    public String getPaymentId(int id)
    {
        RestTemplate rt=new RestTemplate();
        String url ="http://localhost:8080/getpaymentdetails/{id}";
        ResponseEntity<String> response = rt.exchange(url,HttpMethod.GET,null,String.class,id);
        return response.getBody();

    }

    public String getPayemntBytypeandId(int id, String type)
    {
        RestTemplate rt=new RestTemplate();
        String url ="http://localhost:8080/getpaymentdetails?id={id}&type={type}";
        ResponseEntity<String> response = rt.exchange(url,HttpMethod.GET,null,String.class,id,type);
        return response.getBody();
    }
}
