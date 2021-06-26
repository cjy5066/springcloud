package com.hystrix.server;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

//节约时间就直接是一个类，没有接口，没有impl包
@Service
public class PaymentService {

    //正常访问ok的方法
    public String paymentInfo_ok(Integer id){
        return "线程池： "+Thread.currentThread().getName()+ "   ok方法的id： "+id+"\t"+"  成功！！";
    }


/*服务降级    开始===================================================================*/


    //模拟出错的方法
    /*
        表示这个方法执行3秒以内是正常的，超过3秒表示失败。失败后去执行兜底方法（paymentInfo_errHander）。
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_errHander",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")  //3秒钟以内就是正常的业务逻辑
    })
    public String paymentInfo_err(Integer id){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： "+Thread.currentThread().getName()+ "   err方法的id： "+id+"\t"+"  出错，耗时3秒钟";
    }

    //定义的兜底方法
    public String paymentInfo_errHander(Integer id){

        return "线程池： "+Thread.currentThread().getName()+ "   err的降级方法id： "+id+"\t"+"  出错，耗时3秒钟";
    }


/*服务降级  结束======================================================================*/






/* 服务熔断  开始································································*/

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围（单位：毫秒）
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if (id < 0){
            throw new RuntimeException("*****id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+"调用成功,流水号："+serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能负数，请稍候再试,(┬＿┬)/~~     id: " +id;
    }
}
