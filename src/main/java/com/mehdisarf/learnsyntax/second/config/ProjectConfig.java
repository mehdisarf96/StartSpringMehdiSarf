package com.mehdisarf.learnsyntax.second.config;

import com.mehdisarf.learnsyntax.second.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "firstParrot")
    Parrot parrot1(){

        Parrot p = new Parrot();
        p.setName("nok tala");

        return p;
    }

    @Primary
    @Bean(name = "secondParrot")
    Parrot parrot2(){

        Parrot p = new Parrot();
        p.setName("nok hana");

        return p;
    }

    @Bean(name = "thirdParrot")
    Parrot parrot3(){

        Parrot p = new Parrot();
        p.setName("nok bala!");

        return p;
    }
}