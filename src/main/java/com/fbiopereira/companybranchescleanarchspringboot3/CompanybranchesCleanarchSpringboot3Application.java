package com.fbiopereira.companybranchescleanarchspringboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CompanybranchesCleanarchSpringboot3Application {

    public static void main(String[] args) {
        SpringApplication.run(CompanybranchesCleanarchSpringboot3Application.class, args);
    }

}
