package com.fegin.server;

import com.cjy.common.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
//表示调用这个微服务的下的接口
@FeignClient("PROVIDER-PAYMENT-SERVICE")
public interface PaymentFeginServer {

    @GetMapping("/payment/find/{id}")
    public CommonResult find(@PathVariable("id") Long id);
}
