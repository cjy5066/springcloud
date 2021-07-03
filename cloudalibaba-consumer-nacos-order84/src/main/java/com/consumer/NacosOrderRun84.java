package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients     //启动fenign
public class NacosOrderRun84 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderRun84.class,args);
        System.out.println("使用者84 启动成功");
    }
}
