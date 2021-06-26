package com.hystrix.server;

import com.hystrix.server.impl.PaymentServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
    //表示调用这个微服务，，，出错后，服务降级使用这个类的方法。
@FeignClient(value = "PROVIDER-HYSTRIX-SERVICE" ,fallback = PaymentServerImpl.class)
public interface PaymentServer {
    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);


    @GetMapping("/hystrix/err/{id}")
    public String paymentInfo_err(@PathVariable("id") Integer id);
}
