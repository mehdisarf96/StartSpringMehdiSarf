package com.mehdisarf.second.config;

import com.mehdisarf.second.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1(){

        Parrot p = new Parrot();
        p.setName("nok tala");

        return p;
    }

    @Bean
    Parrot parrot2(){

        Parrot p = new Parrot();
        p.setName("nok hana");

        return p;
    }

    @Bean
    Parrot parrot3(){

        Parrot p = new Parrot();
        p.setName("nok bala!");

        return p;
    }
}