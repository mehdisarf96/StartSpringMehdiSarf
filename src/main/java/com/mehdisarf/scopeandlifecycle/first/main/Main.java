package com.mehdisarf.scopeandlifecycle.first.main;

import com.mehdisarf.scopeandlifecycle.first.config.ProjectConfig;
import com.mehdisarf.scopeandlifecycle.first.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService c1 = context.getBean("commentService", CommentService.class);
        CommentService c2 = context.getBean("commentService", CommentService.class);

        System.out.println(c1 == c2);

    }
}
