package com.payment.dao;

import com.cjy.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {

    //添加方法
    public int save(Payment payment);

    //查询方法
    public Payment findByid(Long id);
}
