package com.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.sentinel.myhander.CustomerBlockHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @GetMapping("/byResource")
    //blockHandler表示兜底方法的名称
    @SentinelResource(value="byResource" ,blockHandler="hendler_by")
    public  String getResource(){
        return "200   \t 按资源名称限流测试";
    }

    public String hendler_by(BlockException exception){
        return "500  \t  兜底方法";
    }

    /*
        使用自定义限流逻辑
     */
    @GetMapping("/customeBlocakHandler")
    //  blockHandlerClass 表示使用哪个指定类用来兜底，  blockHandler表示兜底方法的名称
    @SentinelResource(value = "customeBlocakHandler" ,blockHandlerClass = CustomerBlockHandler.class,blockHandler ="handlerException1" )
    public String customeBlocakHandler(){
        return " 自定义限流 兜底-类-方法";
    }
}
