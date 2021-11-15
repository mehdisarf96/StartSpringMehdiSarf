package com.mehdisarf.fifth.config;

import com.mehdisarf.fifth.main.Parrot;
import com.mehdisarf.fifth.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {

        Parrot p = new Parrot();
        p.setName("tooti");

        return p;
    }

    @Bean
    public Person person() {

        Person p = new Person();
        p.setName("mehdi");

        return p;
    }
}