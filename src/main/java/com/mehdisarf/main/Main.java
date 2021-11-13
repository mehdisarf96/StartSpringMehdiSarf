package com.mehdisarf.main;

import com.mehdisarf.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // referring to the Parrot instance from the context
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
    }
}
