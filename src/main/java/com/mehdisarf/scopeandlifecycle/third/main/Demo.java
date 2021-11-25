package com.mehdisarf.scopeandlifecycle.third.main;

import com.mehdisarf.scopeandlifecycle.third.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
