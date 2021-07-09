package com.seata_order.service.impl;

import com.seata_order.dao.OrderDao;
import com.seata_order.domian.Order;
import com.seata_order.service.AccountService;
import com.seata_order.service.OrderService;
import com.seata_order.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 啊珍
 * @Date 2021/7/6 22:42
 * @Version 1.0
 */

@Service
@Slf4j
public class OrderServiceIMpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Autowired
    private StorageService storageService;
    @Autowired
    private AccountService accountService;


    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     */

    @Override
    //name 随便写（全局唯一，不重复），rollbackfor 发送任何异就回滚
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order){
        log.info("----->开始新建订单");
        //新建订单
        orderDao.create(order);


        // 减少库存,下单后，库存总数量减少
        log.info("-------修改库存开始");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->库存以减少");


        //  修改账户余额

        log.info("----->订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用账户，做扣减结束");


        //修改订单状态
        orderDao.update(order.getUserId(),0);


    }
}

