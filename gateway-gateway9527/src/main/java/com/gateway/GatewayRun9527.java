package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayRun9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayRun9527.class,args);
        System.out.println("网关启动成功");
    }
}
