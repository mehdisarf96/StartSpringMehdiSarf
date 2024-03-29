package com.mehdisarf.scopeandlifecycle.seventh.demo;

import com.mehdisarf.scopeandlifecycle.eighth.model.Comment;
import com.mehdisarf.scopeandlifecycle.eighth.services.CommentService;
import com.mehdisarf.scopeandlifecycle.seventh.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}
