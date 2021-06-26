package com.hystrix.controller;

import com.hystrix.server.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hystrix")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    //返回正常的方法
    @GetMapping("/ok/{id}")
    @ResponseBody
    public String payment_ok(@PathVariable("id") Integer id){
        String s = paymentService.paymentInfo_ok(id);
        log.info("----s:"+s);
        return s;
    }


    //会出错的方法
    @GetMapping("/err/{id}")
    @ResponseBody
    public String payment_err(@PathVariable("id") Integer id){
        String s = paymentService.paymentInfo_err(id);
        log.info("----s:"+s);
        return s;
    }


    //测试服务熔断

    @GetMapping("/rongduan/{id}")
    @ResponseBody
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){

        String s = paymentService.paymentCircuitBreaker(id);
        return s;
    }
}
