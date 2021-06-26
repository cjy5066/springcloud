package com.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(EruekaServer7001.class,args);
        System.out.println("Erureka Server 注册中心启动成功");
    }
}
