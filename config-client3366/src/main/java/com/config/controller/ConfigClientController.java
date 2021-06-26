package com.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

@RefreshScope //能实现动态刷新
public class ConfigClientController {

    //获得的是自己yml的端口
    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String info;

    @GetMapping("/config")
    public String config(){
        return "端口号："+port+"  \t"+info;
    }
}
