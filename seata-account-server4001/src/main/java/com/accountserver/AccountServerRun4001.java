package com.accountserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 啊珍
 * @Date 2021/7/7 15:47
 * @Version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AccountServerRun4001 {

    public static void main(String[] args) {
        SpringApplication.run(AccountServerRun4001.class,args);
        System.out.println("seata 测试， 账户accoun微服务4001启动成功");
    }
}

