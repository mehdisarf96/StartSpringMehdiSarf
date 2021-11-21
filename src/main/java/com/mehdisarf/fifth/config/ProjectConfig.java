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
    // Injecting bean dependencies by using parameters of the methods.
    // Spring sets a particular value into the parameter of the person() method
    // when calling it and resolves a dependency of this method.
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("mehdi");

        // establish the relationship between the two instances.
        p.setParrot(parrot);

        return p;
    }
}