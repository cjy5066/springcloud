package com.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelRun8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelRun8401.class,args);
        System.out.println("熔断与限流 启动成功");
    }
}
