package com.payment.service;


import com.cjy.common.entity.Payment;

public interface PaymentService {
    //添加方法
    public int save(Payment payment);

    //查询方法
    public Payment findByid(Long id);
}
