package com.seata_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 啊珍
 * @Date 2021/7/6 14:22
 * @Version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient      // 开启服务注册发现功能
@EnableFeignClients     // 激活Feign
public class SeataOrderRun2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderRun2001.class,args);
        System.out.println("Seata --  使用者：order 启动成功！！！");
    }
}
