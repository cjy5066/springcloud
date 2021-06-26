package com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//  这个注解用于使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
public class ZookerpeeRun8004 {
    public static void main(String[] args) {
        SpringApplication.run(ZookerpeeRun8004.class,args);
        System.out.println("zookeeper,启动成功！");
    }
}
