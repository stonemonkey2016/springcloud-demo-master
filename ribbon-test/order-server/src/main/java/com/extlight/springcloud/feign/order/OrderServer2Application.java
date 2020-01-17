package com.extlight.springcloud.feign.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @descrption:
 * @author: bubbles
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderServer2Application.class, args);
    }
}
