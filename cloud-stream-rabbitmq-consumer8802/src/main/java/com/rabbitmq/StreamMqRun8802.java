package com.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamMqRun8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqRun8802.class,args);
        System.out.println("消息  消费者8802 ");
    }
}
