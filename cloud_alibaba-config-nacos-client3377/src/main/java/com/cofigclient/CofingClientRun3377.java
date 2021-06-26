package com.cofigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class CofingClientRun3377 {
    public static void main(String[] args) {
        SpringApplication.run(CofingClientRun3377.class,args);
        System.out.println("nacos 配置中心 3377");
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
//        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//        c.setIgnoreUnresolvablePlaceholders(true);
//        return c;
//    }
}
