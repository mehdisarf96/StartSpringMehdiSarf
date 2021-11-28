package com.mehdisarf.aop.first.main;

import com.mehdisarf.aop.first.config.ProjectConfig;
import com.mehdisarf.aop.first.model.Comment;
import com.mehdisarf.aop.first.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Mehdi");
        comment.setText("Hello AOP World!");

        String value = commentService.publishComment(comment);

        logger.info(value);
    }
}
