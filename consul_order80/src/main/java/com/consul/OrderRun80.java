package com.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderRun80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderRun80.class,args);
        System.out.println("consul使用者，启动成功·");
    }
}
