package com.seata_order.controller;

import com.seata_order.domian.CommonResult;
import com.seata_order.domian.Order;
import com.seata_order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 啊珍
 * @Date 2021/7/7 16:20
 * @Version 1.0
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }


}
