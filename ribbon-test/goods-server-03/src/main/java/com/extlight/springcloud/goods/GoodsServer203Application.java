package com.extlight.springcloud.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @descrption:
 * @author: bubbles
 */
@EnableEurekaClient
@SpringBootApplication
public class GoodsServer203Application {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServer203Application.class, args);
    }
}
