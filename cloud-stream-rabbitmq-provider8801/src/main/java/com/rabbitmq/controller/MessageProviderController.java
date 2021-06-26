package com.rabbitmq.controller;

import com.rabbitmq.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProviderController {

    @Autowired
    private IMessageProvider mp;

    @GetMapping("/send")
    public String send(){
        mp.send();
        return null;
    }
}
