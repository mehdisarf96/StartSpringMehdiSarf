package com.mehdisarf.second.main;

import com.mehdisarf.second.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // You’ll get an exception on this line because Spring cannot guess which of the three Parrot instances you refer to.
        // Parrot p = context.getBean(Parrot.class);

        Parrot p = context.getBean("parrot3", Parrot.class);

        System.out.println(p.getName());
    }
}
