package com.storageserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 啊珍
 * @Date 2021/7/7 14:36
 * @Version 1.0
 */
@Mapper
public interface StorageDao {

    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
