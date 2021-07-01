package com.payment9004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class payemtRun9004 {

    public static void main(String[] args) {
        SpringApplication.run(payemtRun9004.class,args);
        System.out.println("服务提供者 9004 启动成功");
    }
}
