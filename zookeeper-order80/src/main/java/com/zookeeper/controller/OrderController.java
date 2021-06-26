package com.zookeeper.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Slf4j
@RequestMapping("/order")
public class OrderController {

    private final String PAYMENT_URL="http://provider-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/zk")
    @ResponseBody
    public String getpayment(){
        String payment = restTemplate.getForObject(PAYMENT_URL+"/zk/zk", String.class);
        return payment;
    }
}
