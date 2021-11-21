package com.mehdisarf.sixth.main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Shoko";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot " + name;
    }
}
