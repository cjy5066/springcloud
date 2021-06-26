package com.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulRun8006 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulRun8006.class,args);
        System.out.println("Consul 微服务启动成功");
    }
}
