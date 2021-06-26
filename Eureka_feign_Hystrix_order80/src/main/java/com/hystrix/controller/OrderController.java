package com.hystrix.controller;

import com.hystrix.server.PaymentServer;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
@Slf4j
@DefaultProperties(defaultFallback = "All_fallback")  //设置一个全局的兜底方法
public class OrderController {

    @Autowired
    private PaymentServer paymentServer;

    @GetMapping("/ok/{id}")
    @ResponseBody
    public String payment_ok(@PathVariable("id") Integer id){
        String s = paymentServer.paymentInfo_ok(id);
        log.info("==========s: "+s);
        return s;
    }

    @GetMapping("/err/{id}")
    @ResponseBody
     /*
        表示这个方法执行3秒以内是正常的，超过3秒表示失败。失败后去执行指定的兜底方法（paymentInfo_errHander）。
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_errHander",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")  //1.5秒钟以内就是正常的业务逻辑，但是提供方的容错是3秒，所有依然报错
    })
    public String payment_err(@PathVariable("id") Integer id){
        String s = paymentServer.paymentInfo_err(id);
        log.info("==========s: "+s);
        return s;
    }


    //定义的兜底方法
    public String paymentInfo_errHander(Integer id){
        return "线程池： "+Thread.currentThread().getName()+"   80端口       err的降级方法id： "+id+"\t"+"  出错，耗时3秒钟";
    }


    @GetMapping("/err2/{id}")
    @ResponseBody
    @HystrixCommand     //这里没有指定兜底方法所以使用全局兜底方法
    public String payment_err2(@PathVariable("id") Integer id){
        String s = paymentServer.paymentInfo_err(id);
        log.info("==========s: "+s);
        return s;
    }

    //定义一个全局的fallback兜底方法
    public String All_fallback(){
        return "全局fallback  全局兜底方法";
    }
}
