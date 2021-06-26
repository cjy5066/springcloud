package com.consul.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContext {

    @Bean
    //使用这个注解赋予RestTemplate负载均衡的能力
    @LoadBalanced   //负载均衡，用了这个注解在控制层种，就可以直接调用服务名称，可以不用获取ip和端口号
    public RestTemplate getrestTemplate(){
        return new RestTemplate();
    }
}
