package com.consumer.server.impl;

import com.cjy.common.entity.CommonResult;
import com.cjy.common.entity.Payment;
import com.consumer.server.PaymentService;
import org.springframework.stereotype.Component;

//  兜底类，
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
