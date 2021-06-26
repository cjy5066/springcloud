package com.consul.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@Slf4j
@RequestMapping("/con")
public class PaymentController {

    @Value("${server.port}")
    private String serverPsot;


    @RequestMapping("/sul")
    @ResponseBody
    public String getConsul(){
        return "Spring Cloud  Consul  post: "+serverPsot+"\t\t"+ UUID.randomUUID().toString();
    }
}
