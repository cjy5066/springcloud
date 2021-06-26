package com.cofigclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope   //实现配置文件自动更新
public class ConfigController {

    @Value("${config.info}")
    public String configInfog;

    @GetMapping("/nacos/config")
    public String getConfigInfog(){
        return configInfog;
    }

}
