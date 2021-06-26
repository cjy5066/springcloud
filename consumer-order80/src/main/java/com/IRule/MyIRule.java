package com.IRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//自定义Ribbon的负载规则，这个类放在启动类可以扫到包下
@Configuration
public class MyIRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();  //定义为随机，默认为轮询
    }

}
