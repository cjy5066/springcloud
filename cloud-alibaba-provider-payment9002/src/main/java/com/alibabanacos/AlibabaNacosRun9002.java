package com.alibabanacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosRun9002 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosRun9002.class,args);
        System.out.println("阿里巴巴 nacos 9002 启动成功");
    }
}
