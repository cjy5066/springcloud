package com.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

//全局日志
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        String username = queryParams.getFirst("username");

        /*
                上面的代码类似于：
                String name = HttpServletRequest.getParameter("name");
                这段代码的意思就是：在访问的时候，必须带上username这个参数，没有就拦截
                像这样：http://localhost:9527/payment/find/1?username=ssfafe
         */
        if(username.equals("") || username==null){
            log.info("用户名为 空 ---------");
            ServerHttpResponse response = exchange.getResponse();
            boolean b = response.setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //如果有，那么就放行
        return chain.filter(exchange);
    }

    //有多个过滤器时，首先加载的过滤器，就是一个顺序，顺序越小，越先加载
    @Override
    public int getOrder() {
        return 0;
    }
}
