package org.example.consumer.Service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FlipkartService {

    public ResponseEntity<List<String>> getPaymentdetails() {

        RestTemplate rt = new RestTemplate();

        ResponseEntity<List> response = rt.exchange(
                "http://localhost:8080/payment",
                HttpMethod.GET,
                null,
                List.class
        );

        return ResponseEntity.ok(response.getBody());
    }
}