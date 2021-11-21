package com.mehdisarf.seventh.main;

import com.mehdisarf.seventh.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person thePerson = context.getBean(Person.class);

        System.out.println("The Person's Name: "+thePerson.getName());
        System.out.println("The Person's Parrot: "+thePerson.getParrot());
    }
}
