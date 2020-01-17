package com.extlight.springcloud.feign.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer9002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer9002Application.class, args);
    }

}
