package com.mehdisarf.third.main;

import com.mehdisarf.third.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        //Prints null because we did not assign any name to the parrot instance added by Spring in its context
        System.out.println(p.getName());
    }
}
