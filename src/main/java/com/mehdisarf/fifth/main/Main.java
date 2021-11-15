package com.mehdisarf.fifth.main;

import com.mehdisarf.fifth.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot theParrot = context.getBean(Parrot.class);

        Person thePerson = context.getBean(Person.class);

        System.out.println(theParrot.getName());

        System.out.println(thePerson.getName());


        // the two instances aren’t yet linked to one another.
        // there’s not yet a relationship between the instances.
        // the two beans are in the context, but no link has been established between them.
        System.out.println(thePerson.getParrot());
    }
}
