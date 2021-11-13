package com.mehdisarf.config;

import com.mehdisarf.main.Parrot;
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
}
