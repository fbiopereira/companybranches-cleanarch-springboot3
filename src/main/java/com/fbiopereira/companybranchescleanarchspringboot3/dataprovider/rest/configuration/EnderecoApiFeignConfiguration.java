package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.configuration;

import com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.customerrordecoder.EnderecoApiErrorDecoder;
import feign.Logger;
import feign.codec.ErrorDecoder;
import feign.okhttp.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnderecoApiFeignConfiguration {

    @Value("${feign.configuration.connectTimeoutMilis}")
    public int connectTimeoutMilis;

    @Value("${feign.configuration.readTimeoutMilis}")
    public int readTimeoutMilis;

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
    @Bean
    ErrorDecoder errorDecoder() {
        return new EnderecoApiErrorDecoder();
    }


}

