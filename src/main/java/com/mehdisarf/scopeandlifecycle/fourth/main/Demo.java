package com.mehdisarf.scopeandlifecycle.fourth.main;

import com.mehdisarf.scopeandlifecycle.fourth.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
