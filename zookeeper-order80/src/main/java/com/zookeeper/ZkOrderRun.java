package com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkOrderRun {

    public static void main(String[] args) {
        SpringApplication.run(ZkOrderRun.class,args);
        System.out.println("zookeeper  调用者启动成功！");
    }
}
