package com.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

@RefreshScope     //能实现动态刷新
public class ConfigCloentController {
    //得到的是gitee上的配置文件
    @Value("${config.info}")
    public String ConfigInfo;

    @RequestMapping("/configinfo")
    public String configinfo(){
        return ConfigInfo;
    }
}
