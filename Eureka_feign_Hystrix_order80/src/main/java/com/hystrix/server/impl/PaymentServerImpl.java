package com.hystrix.server.impl;

import com.hystrix.server.PaymentServer;
import org.springframework.stereotype.Service;

@Service
public class PaymentServerImpl implements PaymentServer {

    @Override
    public String paymentInfo_ok(Integer id) {
        return "实现server接口， 解决controller代码膨胀   ok方法   ";
    }

    @Override
    public String paymentInfo_err(Integer id) {
        return "实现server接口， 解决controller代码膨胀   err方法   ";
    }
}
