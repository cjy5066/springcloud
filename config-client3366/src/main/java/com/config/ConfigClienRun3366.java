package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClienRun3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClienRun3366.class,args);
        System.out.println("分布式配置中心   客户端启动成功");
    }
}
