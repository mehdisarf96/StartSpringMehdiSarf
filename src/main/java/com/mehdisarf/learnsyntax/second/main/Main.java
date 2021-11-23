package com.mehdisarf.learnsyntax.second.main;

import com.mehdisarf.learnsyntax.second.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // will not throw an exception anymore:
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
    }
}
