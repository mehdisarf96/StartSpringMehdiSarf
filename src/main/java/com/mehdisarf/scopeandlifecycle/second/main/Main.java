package com.mehdisarf.scopeandlifecycle.second.main;

import com.mehdisarf.scopeandlifecycle.second.config.ProjectConfig;
import com.mehdisarf.scopeandlifecycle.second.services.CommentService;
import com.mehdisarf.scopeandlifecycle.second.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        UserService userService = context.getBean(UserService.class);

        boolean b =
                commentService.getCommentRepository() == userService.getCommentRepository();

        System.out.println(b);
    }
}
