package com.fbiopereira.dataprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.fbiopereira.dataprovider.rest.client")
@SpringBootApplication
public class SpringDataProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataProviderApplication.class, args);
    }
}
