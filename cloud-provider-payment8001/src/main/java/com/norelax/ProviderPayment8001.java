package com.norelax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment8001.class, args);
    }
}