package com.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @GetMapping("/byResource")
    @SentinelResource(value="byResource" ,blockHandler="hendler_by")
    public  String getResource(){
        return "200   \t 按资源名称限流测试";
    }

    public String hendler_by(BlockException exception){
        return "500  \t  兜底方法";
    }


}
