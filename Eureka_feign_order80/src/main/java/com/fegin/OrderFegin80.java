package com.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients     //激活开启Feign
public class OrderFegin80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFegin80.class,args);
        System.out.println("Fegin80 启动成功");
    }
}
