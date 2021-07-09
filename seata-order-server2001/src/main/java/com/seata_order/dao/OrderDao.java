package com.seata_order.dao;

import com.seata_order.domian.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 啊珍
 * @Date 2021/7/6 22:38
 * @Version 1.0
 */
@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    //@Param是地处Dao层，是为了传递多个参数，解决的是可读性和直观性
    //作为Dao层的注解，作用是用于传递参数
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
