package com.atguigu.boot.activemq.topic.consumer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Topic_Consumer {

    @JmsListener(destination = "${topic-name}")
    public void receive(TextMessage message) {
        try {
            System.out.println("消费者收到的消息：" + message.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
