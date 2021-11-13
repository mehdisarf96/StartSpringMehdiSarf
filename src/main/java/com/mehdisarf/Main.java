package com.mehdisarf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Spring context instance.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // A parrot instance
        Parrot parrot = new Parrot();
    }
}
