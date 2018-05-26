package com.baojia.backstage.userservice;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @author wxr
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/5/22 19:45
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.baojia.backstage.orderservice.modules.*.dao"})
@EnableDubboConfiguration
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class);
    }
}
