package com.extlight.springcloud.feign.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @descrption:
 * @author: bubbles
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer2Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class, args);
    }
}
