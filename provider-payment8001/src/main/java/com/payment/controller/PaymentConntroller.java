package com.payment.controller;


import com.cjy.common.entity.CommonResult;
import com.cjy.common.entity.Payment;
import com.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j      //日志
@RequestMapping("/payment")
public class PaymentConntroller {

    @Autowired
    private PaymentService paymentService;

    /*
        这个类可以获取到注册中心上的基本信息。
     */
    @Autowired
    private DiscoveryClient discoveryClient;
    
    @Value("${server.port}")
    private String serverPath;

    @GetMapping("/port")
    public String getServerPath(){
        return serverPath;
    }

    @PostMapping("/save")
    public CommonResult con(@RequestBody Payment payment){
        int save = paymentService.save(payment);
        log.info("插入结果： "+save);

        if(save>0){
            return new CommonResult(200,"添加成功",save);
        }else {
            return new CommonResult(444,"添加失败",null);
        }

    }

    @GetMapping("/find/{id}")
    public CommonResult find(@PathVariable Long id){
        Payment byid = paymentService.findByid(id);
        log.info("查询结果： "+byid);
        if(byid!=null){
            return new CommonResult(200,"查询成功,端口号："+serverPath,byid);
        }else {
            return new CommonResult(444,"查询失败",null);
        }

    }
    
    @GetMapping("/client")
    public DiscoveryClient getDiscoveryClient(){
        /*
            获得注册中心上有哪些服务注册了
         */
        List<String> services = discoveryClient.getServices();
        for(String string:services){
            log.info("微服务服务名称：----"+string);
        }

        /*
            H获取指定微服务名称  下面全部实列的基本信息
         */
        List<ServiceInstance> instances = discoveryClient.getInstances("PROVIDER-PAYMENT-SERVICE");
        for (ServiceInstance in: instances){
            log.info(in.getServiceId()+"\t"+in.getPort()+"\t"+in.getHost()+"\t"+in.getScheme());
            log.info(in.getMetadata()+"\t"+in.getUri());
        }
        return discoveryClient;
    }



    @GetMapping("/zipkin")
    public String paymentZipkin()
    {
        return "hi ,i'am paymentzipkin server fall back，welcome to atguigu，O(∩_∩)O哈哈~";
    }
}
