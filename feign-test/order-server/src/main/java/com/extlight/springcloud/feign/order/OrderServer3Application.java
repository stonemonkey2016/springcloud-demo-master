package com.extlight.springcloud.feign.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @descrption:
 * @author: bubbles
 */
@EnableFeignClients(basePackages = {"com.extlight.springcloud.feign"})
@EnableEurekaClient
@SpringBootApplication
public class OrderServer3Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderServer3Application.class, args);
    }
}
