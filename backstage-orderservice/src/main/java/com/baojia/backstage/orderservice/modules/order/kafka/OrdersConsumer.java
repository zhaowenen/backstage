package com.baojia.backstage.orderservice.modules.order.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author wxr
 * @Title: OrdersConsumer
 * @Description: 定时接收订单服务的kafka消息
 * @date 2018/5/25 19:27*/


@Component
public class OrdersConsumer {
/**
     * 监听test主题,有消息就读取
     * @param message*/


    @KafkaListener(topics = {"test"},groupId = "backstageGroup")
    public void consumer(String message){
        System.out.println("test topic message : {}"+message);
    }


}
