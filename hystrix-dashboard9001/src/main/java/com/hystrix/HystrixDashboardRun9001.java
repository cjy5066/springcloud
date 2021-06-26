package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard     //开启仪表盘监控注解
public class HystrixDashboardRun9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardRun9001.class,args);
        System.out.println("图形化——仪表板启动成功！！");
    }


}
