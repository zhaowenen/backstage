package com.baojia.backstage.orderservice;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.baojia.backstage.orderservice.modules.order.kafka.OrdersSender;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author wxr
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/5/22 19:45
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.baojia.backstage.orderservice.modules.*.dao"})
@EnableDubboConfiguration
@EnableScheduling
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class);
    }

    @Autowired
    private OrdersSender kafkaSender;
    //然后每隔1分钟执行一次
    @Scheduled(fixedRate = 1000 * 3)
    public void testKafka() throws Exception {
        kafkaSender.sendTest();
    }
}
