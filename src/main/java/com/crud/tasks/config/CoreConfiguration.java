package com.crud.tasks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //utworzenie miejsca dla tworzenia "ręcznych" beanów
public class CoreConfiguration {

    @Bean
    public RestTemplate restTemplate() { //umożliwia realizowanie żądań HTTP pomiędzy serwerami
        return new RestTemplate();
    }
}