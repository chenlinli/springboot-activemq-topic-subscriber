package com.cl.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {
    @JmsListener(destination = "${myTopicSB}")
    public void recieve(String msg){
        System.out.println("发布订阅模式：消费消息:"+msg);
    }

}
