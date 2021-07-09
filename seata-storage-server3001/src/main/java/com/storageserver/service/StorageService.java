package com.storageserver.service;

/**
 * @Author 啊珍
 * @Date 2021/7/7 14:42
 * @Version 1.0
 */
public interface StorageService {

    //扣减库存信息
    void decrease(Long productId, Integer count);


}
