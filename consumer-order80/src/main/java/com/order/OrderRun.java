package com.order;

import com.IRule.MyIRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//这个注解表示使用这个微服务，负载规则为自定义的类
@RibbonClient(name = "PROVIDER-PAYMENT-SERVICE",configuration = MyIRule.class)
public class OrderRun {
    public static void main(String[] args) {
        SpringApplication.run(OrderRun.class,args);
        System.out.println("微服务---订单启动成功");
    }
}
