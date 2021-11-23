package com.mehdisarf.learnsyntax.fifth.main;

import com.mehdisarf.learnsyntax.fifth.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot theParrot = context.getBean(Parrot.class);

        Person thePerson = context.getBean(Person.class);

        System.out.println(theParrot.getName());
        System.out.println(thePerson.getName());

        // the two instances are linked to one another.
        // now there’s a relationship between the instances.
        // the two beans are in the context, and a link has been established between them.
        System.out.println(thePerson.getParrot());
    }
}
