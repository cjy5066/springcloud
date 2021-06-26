package com.payment.service.impl;


import com.cjy.common.entity.Payment;
import com.payment.Payment8001;
import com.payment.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Payment8001.class)
public class PaymentServiceImplTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void save() {
        Payment payment = new Payment();
        payment.setSerial("adfdsfdsf");
        paymentService.save(payment);
    }

    @Test
    public void findByid() {
    }
}
