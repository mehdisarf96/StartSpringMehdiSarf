package com.mehdisarf.seventh.config;

import com.mehdisarf.seventh.main.Parrot;
import com.mehdisarf.seventh.main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
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

    @Bean
    public Person person(@Qualifier("parrot2") Parrot par) {

        Person p = new Person();
        p.setName("Mehdi");
        p.setParrot(par);

        return p;
    }
}