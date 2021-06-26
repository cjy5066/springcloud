package com.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//代码的方式配置路由网关
@Configuration
public class GateWayConfig {

    //路由构建器
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_atguigu", r -> r.path("/docs")
                .uri("https://hutool.cn/docs/#/"))  //糊涂工具包的官网
                .build();
        routes.route("csdn_git",r ->r.path("/git")
                .uri("https://blog.csdn.net/qq_18297675/article/details/79633950"))
                .build();
        return routes.build();
    }


}
