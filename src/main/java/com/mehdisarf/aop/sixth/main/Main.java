package com.mehdisarf.aop.sixth.main;

import com.mehdisarf.aop.sixth.config.ProjectConfig;
import com.mehdisarf.aop.sixth.model.Comment;
import com.mehdisarf.aop.sixth.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Mehdi");
        comment.setText("Hello AOP World!");

        String result = commentService.publishComment(comment);
        System.out.println(result);
    }
}
