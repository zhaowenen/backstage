package com.baojia.backstage.depositservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
* @Title: DepositServiceApplication  
* @Description: 押金模块服务端启动类 
* @author renjing  
* @date 2018年5月23日 上午10:22:12
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.baojia.backstage.depositservice.modules.*.dao"})
@EnableDubboConfiguration
public class DepositServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DepositServiceApplication.class);
    }
}
