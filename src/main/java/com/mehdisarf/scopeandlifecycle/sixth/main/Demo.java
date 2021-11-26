package com.mehdisarf.scopeandlifecycle.sixth.main;

import com.mehdisarf.scopeandlifecycle.sixth.config.ProjectConfig;
import com.mehdisarf.scopeandlifecycle.sixth.services.CommentService;
import com.mehdisarf.scopeandlifecycle.sixth.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cService = context.getBean(CommentService.class);
        UserService uService = context.getBean(UserService.class);

        boolean b = cService.getCommentRepository() == uService.getCommentRepository();

        // Because CommentRepository is a prototype bean, the result of the
        // comparison is always false.
        System.out.println(b);
    }
}
