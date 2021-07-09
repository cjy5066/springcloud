package com.accountserver.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author 啊珍
 * @Date 2021/7/7 15:55
 * @Version 1.0
 */

public interface AccounService {
    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
