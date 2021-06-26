package com.rebbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamMq8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMq8803.class,args);
        System.out.println("消息使用者8803 ");
    }
}
