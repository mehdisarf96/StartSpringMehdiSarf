package com.mehdisarf.sixth.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Meyti";

    private Parrot parrot;

    // in constructor ro faqat neveshtam inja ke neshun bedam ejra nemishe.
    public Person() {
        System.out.println("no Args Constructor");
    }

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
