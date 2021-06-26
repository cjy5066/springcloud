package com.payment.service.impl;

import com.cjy.common.entity.Payment;
import com.payment.dao.PaymentDao;
import com.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao dao;

    @Override
    public int save(Payment payment) {
        int save = dao.save(payment);
        return save;
    }

    @Override
    public Payment findByid(Long id) {
        Payment byid = dao.findByid(id);
        return byid;
    }
}
