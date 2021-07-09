package com.seata_order.service;

import com.seata_order.domian.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 啊珍
 * @Date 2021/7/7 14:55
 * @Version 1.0
 */

// 调用库存service

@FeignClient(value = "seata-storage-service")
public interface StorageService {

    //扣减库存
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
