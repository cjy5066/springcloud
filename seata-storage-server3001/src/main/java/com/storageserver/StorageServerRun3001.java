package com.storageserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 啊珍
 * @Date 2021/7/7 14:22
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class StorageServerRun3001 {
    public static void main(String[] args) {
        SpringApplication.run(StorageServerRun3001.class,args);
        System.out.println("演示Seata  库存启动成功！！！3001");
    }
}
