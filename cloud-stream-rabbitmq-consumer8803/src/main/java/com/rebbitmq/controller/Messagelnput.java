package com.rebbitmq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
//定义消息接收的管道
@EnableBinding(Sink.class)
public class Messagelnput {

    @Value("${server.port}")
    private String serverPort;

    /**
     *
     * @param message   由于生产者发送的是String类型的消息，所以这里的泛型也string类型的
     * @return
     */
    //消息监听  消费者sink
    @StreamListener(Sink.INPUT)
    public void Input(Message<String> message){
        System.out.println("消费者2号，-------》 消息内容是： "+message.getPayload()+"\t  端口号：   "+serverPort);
    }


}
