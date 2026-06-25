package org.example.httpheaders.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;

@RestController
public class controllerClass {
    @GetMapping("/getreq")
    public ResponseEntity<String> getHeaders(
            @RequestHeader("service-token") String m) {

        HttpHeaders responseHeaders = new HttpHeaders();

        responseHeaders.add("user", "likith");
        responseHeaders.add("company", "OpenAI");
        responseHeaders.add("version", "1.0");

        System.out.println(m);

        return new ResponseEntity<>("Welcome", responseHeaders, HttpStatus.OK);
    }
//--------------------------------------------------------------------------------
//    @GetMapping("/getreq")
//    public void getHeaders(HttpServletRequest request) {
//
//        Enumeration<String> headerNames = request.getHeaderNames();
//
//        while (headerNames.hasMoreElements()) {
//            String headerName = headerNames.nextElement();
//            String headerValue = request.getHeader(headerName);
//            System.out.println(headerName + " : " + headerValue);
//        }
//    }
}