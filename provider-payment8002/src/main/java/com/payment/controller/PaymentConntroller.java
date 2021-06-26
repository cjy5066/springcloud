package com.payment.controller;


import com.cjy.common.entity.CommonResult;
import com.cjy.common.entity.Payment;
import com.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j      //日志
@RequestMapping("/payment")
public class PaymentConntroller {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPath;

    @PostMapping("/save")
    public CommonResult con(@RequestBody Payment payment){
        int save = paymentService.save(payment);
        log.info("插入结果： "+save);

        if(save>0){
            return new CommonResult(200,"添加成功 ",save);
        }else {
            return new CommonResult(444,"添加失败",null);
        }

    }
 
    @GetMapping("/find/{id}")
    public CommonResult find(@PathVariable Long id){
        Payment byid = paymentService.findByid(id);
        log.info("查询结果： "+byid);
        if(byid!=null){
            return new CommonResult(200,"查询成功 ,端口号："+serverPath,byid);
        }else {
            return new CommonResult(444,"查询失败",null);
        }

    }
}
