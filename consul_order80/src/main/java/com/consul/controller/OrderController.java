package com.consul.controller;

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

    private final String PAYMENT_URL="http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/consul")
    @ResponseBody
    public String orderConsul(){
        String rest = restTemplate.getForObject(PAYMENT_URL + "/con/sul", String.class);
        return rest;
    }
}
