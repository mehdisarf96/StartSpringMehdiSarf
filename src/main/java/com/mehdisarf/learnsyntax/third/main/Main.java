package com.mehdisarf.learnsyntax.third.main;

import com.mehdisarf.learnsyntax.third.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);

        // will not prints null anymore.
        System.out.println(p.getName());
    }
}
