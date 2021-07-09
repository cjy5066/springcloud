package com.accountserver.controller;

import com.accountserver.domian.CommonResult;
import com.accountserver.service.AccounService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author 啊珍
 * @Date 2021/7/7 16:02
 * @Version 1.0
 */
@RestController
public class AccountCotroller {

    @Autowired
    private AccounService accounService;



    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userid") Long userId, @RequestParam("money") BigDecimal money){
        System.out.println();
        System.out.println("==============================  账户"+userId);
        accounService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }


}
