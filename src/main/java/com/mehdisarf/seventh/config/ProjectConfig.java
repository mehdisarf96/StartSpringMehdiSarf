package com.mehdisarf.seventh.config;

import com.mehdisarf.seventh.main.Parrot;
import com.mehdisarf.seventh.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

    /*
    The identifier of the parameter MATCHES the name of one of the beans from the context.
    In this case, Spring will choose the bean for which the name is the same as the parameter.
     */
    @Bean
    public Person person(Parrot parrot2) {

        Person p = new Person();
        p.setName("Mehdi");
        p.setParrot(parrot2);

        return p;
    }
}