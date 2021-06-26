package com.zookeeper.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("/zk")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/zk")
    @ResponseBody
    public String paymentzk(){
        return "Spring cloud zookeeper : "+serverPort+"\t" +UUID.randomUUID().toString();
    }

}
