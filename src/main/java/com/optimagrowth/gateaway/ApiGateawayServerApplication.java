package com.optimagrowth.gateaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiGateawayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGateawayServerApplication.class, args);
    }

}
