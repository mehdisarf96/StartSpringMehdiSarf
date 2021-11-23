package com.mehdisarf.learnsyntax.seventh.config;

import com.mehdisarf.learnsyntax.seventh.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mehdisarf.learnsyntax.seventh.main")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {

        Parrot p = new Parrot();
        p.setName("Hanaii");
        return p;
    }

    @Bean
    public Parrot parrot2() {

        Parrot p = new Parrot();
        p.setName("Tallaii");
        return p;
    }
}