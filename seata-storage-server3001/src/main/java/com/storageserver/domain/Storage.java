package com.storageserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 啊珍
 * @Date 2021/7/7 14:26
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;

}
