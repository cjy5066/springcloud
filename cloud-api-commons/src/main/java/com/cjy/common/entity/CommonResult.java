package com.cjy.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//返回类型结果集
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;       //编码值
    private  String message;    //结果说明
    private  T data;    //类

    public CommonResult(Integer code,String nessage){
        this(code,nessage,null);
    }
}
