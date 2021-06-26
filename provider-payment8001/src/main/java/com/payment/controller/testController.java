package com.payment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("/test")
    public String getindex(){
        return "来了！！，曹尼玛";
    }
}
