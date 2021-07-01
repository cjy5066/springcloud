package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class paymentRun9003 {

    public static void main(String[] args) {
        SpringApplication.run(paymentRun9003.class,args);
        System.out.println("服务提供者，9003启动成功");
    }
}
