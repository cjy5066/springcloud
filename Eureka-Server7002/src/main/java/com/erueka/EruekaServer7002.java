package com.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaServer7002 {
    public static void main(String[] args) {
        SpringApplication.run(EruekaServer7002.class,args);
        System.out.println("EruekaServer7002 注册中心--7002启动成功");
    }
}
