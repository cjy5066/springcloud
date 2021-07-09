package com.accountserver.service.impl;

import com.accountserver.dao.AccountDao;
import com.accountserver.service.AccounService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author 啊珍
 * @Date 2021/7/7 15:56
 * @Version 1.0
 */
@Service
@Slf4j
public class AccounServiceImpl implements AccounService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccounServiceImpl.class);


    @Autowired
    private AccountDao accountDao;


    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");

        try{
            Thread.sleep(20000);
        }catch (Exception e){
            e.printStackTrace();
        }
        accountDao.decrease(userId,money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }
}
