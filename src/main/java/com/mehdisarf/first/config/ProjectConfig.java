package com.mehdisarf.first.config;

import com.mehdisarf.first.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){

        Parrot p = new Parrot();
        p.setName("nok tala");

        return p;
    }

    @Bean
    String greetingText(){
        return "Hello";
    }

    @Bean
    Integer age(){
        return 90;
    }
}