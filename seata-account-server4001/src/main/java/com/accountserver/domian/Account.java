package com.accountserver.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author 啊珍
 * @Date 2021/7/7 15:51
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {


    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;

}
