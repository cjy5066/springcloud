package com.seata_order.service;

import com.seata_order.domian.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author 啊珍
 * @Date 2021/7/7 16:05
 * @Version 1.0
 */

// 调用账户微服务
@FeignClient(value = "seata-account-service")
public interface AccountService {

    //  账户修改余额
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userid") Long userId, @RequestParam("money") BigDecimal money);

}
