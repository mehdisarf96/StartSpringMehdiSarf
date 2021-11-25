package com.mehdisarf.scopeandlifecycle.fourth.main;

import com.mehdisarf.scopeandlifecycle.fourth.config.ProjectConfig;
import com.mehdisarf.scopeandlifecycle.fourth.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("<< Before retrieving the CommentService >>");

        // where Spring needs to provide a reference to the CommentService bean,
        // Spring also creates the instance.
        CommentService cService = context.getBean(CommentService.class);

        System.out.println("<< After retrieving the CommentService >>");
    }
}
