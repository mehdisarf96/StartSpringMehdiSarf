package com.mehdisarf.scopeandlifecycle.fifth.main;

import com.mehdisarf.scopeandlifecycle.fifth.config.ProjectConfig;
import com.mehdisarf.scopeandlifecycle.fifth.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        // To prove that every time we request 'the bean' we get a new instance,
        // we request the beans twice from the context.
        // We observe that the references we get are different.
        CommentService cs1 = context.getBean("commentService", CommentService.class);
        CommentService cs2 = context.getBean("commentService", CommentService.class);

        System.out.println(cs1 == cs2);
    }
}
