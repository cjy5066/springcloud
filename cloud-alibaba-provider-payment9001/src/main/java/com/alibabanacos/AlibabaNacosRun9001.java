package com.alibabanacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosRun9001 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosRun9001.class,args);
        System.out.println("阿里巴巴 nacos 启动成功");
    }
}
