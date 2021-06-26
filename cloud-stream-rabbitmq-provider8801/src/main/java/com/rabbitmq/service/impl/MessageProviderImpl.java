package com.rabbitmq.service.impl;

import com.rabbitmq.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

//定义消息推送的管道
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel  output; //消息发送管道

    @Override
    public String send() {

        String string = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(string).build());
        System.out.println("流水号==========="+string);
        return null;
    }
}
