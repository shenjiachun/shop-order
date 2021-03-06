package com.shop.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author YKF
 * @date 2020/3/18上午11:41
 */
@SpringBootApplication
@MapperScan({"com.shop.db.order"})
@ComponentScan(basePackages = {"com.shop.cache.*","com.shop.order"})
@EnableDubbo(scanBasePackages  = "com.shop.order.service.impl")
@EnableAsync
public class ShopOrderAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopOrderAdminApplication.class, args);
    }
}
