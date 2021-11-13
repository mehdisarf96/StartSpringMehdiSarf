package com.mehdisarf.second.main;

import com.mehdisarf.second.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // will throw an exception:
        // Parrot p = context.getBean("parrot3", Parrot.class);

        Parrot p = context.getBean("thirdParrot", Parrot.class);

        System.out.println(p.getName());
    }
}
