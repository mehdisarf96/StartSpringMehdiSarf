package com.mehdisarf.aop.second.main;

import com.mehdisarf.aop.second.config.ProjectConfig;
import com.mehdisarf.aop.second.model.Comment;
import com.mehdisarf.aop.second.services.CommentService;
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
