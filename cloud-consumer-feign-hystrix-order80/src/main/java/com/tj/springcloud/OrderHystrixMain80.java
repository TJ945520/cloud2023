package com.tj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author TANJIE
 * @date 2023/3/29 19:09
 */
    @SpringBootApplication
    @EnableFeignClients
    @EnableHystrix
    public class OrderHystrixMain80 {
        public static void main(String[] args) {
            SpringApplication.run(OrderHystrixMain80.class, args);
        }
    }
