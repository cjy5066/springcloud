package com.fegin.controller;

import com.cjy.common.entity.CommonResult;
import com.fegin.server.PaymentFeginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fegin")
public class OrderController {

    @Autowired
    private PaymentFeginServer paymentFeginServer;

    @GetMapping("/order/{id}")
    @ResponseBody
    public CommonResult feginOrder(@PathVariable("id") Long id){
        CommonResult result = paymentFeginServer.find(id);
        return result;
    }
}
