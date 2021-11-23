package com.mehdisarf.learnsyntax.first.main;

import com.mehdisarf.learnsyntax.first.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // referring to the Parrot instance from the context
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());

        // refer to these two new beans.
        String myString = context.getBean(String.class);
        System.out.println(myString);

        Integer number = context.getBean(Integer.class);
        System.out.println(number);

    }
}
