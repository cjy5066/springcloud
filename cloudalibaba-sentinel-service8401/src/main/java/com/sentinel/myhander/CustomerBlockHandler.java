package com.sentinel.myhander;

import com.alibaba.csp.sentinel.slots.block.BlockException;

// 公有类，公有的兜底内
public class CustomerBlockHandler {

    //兜底方法1
    public static String handlerException1(BlockException exception){
        return "4444  \t 自定义限流逻辑，  \t  CustomerBlockHandler";

    }

    // 兜底方法2


    // 兜底方法3

    // …………
}
