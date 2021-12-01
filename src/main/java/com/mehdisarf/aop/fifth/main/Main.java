package com.mehdisarf.aop.fifth.main;

import com.mehdisarf.aop.fifth.config.ProjectConfig;
import com.mehdisarf.aop.fifth.model.Comment;
import com.mehdisarf.aop.fifth.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Mehdi");
        comment.setText("Hello AOP World!");

        commentService.publishComment(comment);
    }
}
