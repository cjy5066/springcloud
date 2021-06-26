package com.order.controller;

import com.cjy.common.entity.CommonResult;
import com.cjy.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/order")
@RestController
@Slf4j
public class PaymentController {

    //这里采用的是硬编码
    //public  static  final String RAYMENT_URL="http://localhost:8001";

    //提供者在注册中心的注册名称
    public static final String RAYMENT_URL="http://PROVIDER-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping("/save")
    public CommonResult<Payment> save(Payment pan){
        CommonResult commonResult = restTemplate.postForObject(RAYMENT_URL + "/payment/save", pan, CommonResult.class);
        return commonResult;
    }

    //查询方法
    @GetMapping("/find/{id}")
    public CommonResult find(@PathVariable Long id){

        CommonResult forObject = restTemplate.getForObject(RAYMENT_URL + "/payment/find/" + id, CommonResult.class);
        log.info("-----结果："+forObject);
        return forObject;

    }

    @RequestMapping("/find2/{id}")
    @ResponseBody
    public CommonResult getpayment(@PathVariable Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(RAYMENT_URL + "/payment/find/" + id, CommonResult.class);

        if(entity.getStatusCode().is2xxSuccessful()){
            System.out.println(entity.getBody());
            return entity.getBody();
        }else {
            return new CommonResult(444,"错误");
        }
    }



    // ====================> zipkin+sleuth
    @GetMapping("/zipkin")
    @ResponseBody
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject(RAYMENT_URL+"/payment/zipkin", String.class);
        return result;
    }
}
