package com.mehdisarf.learnsyntax.fourth.main;

import com.mehdisarf.learnsyntax.fourth.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = new Parrot();
        p.setName("qermezi");

        Supplier<Parrot> parrotSupplier = () -> p;

        // Using the registerBean() method to add specific object instances to the Spring context.
        context.registerBean("parrot1",Parrot.class,parrotSupplier);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
