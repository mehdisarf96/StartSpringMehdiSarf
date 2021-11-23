package com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.demo;

import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.config.ProjectConfig;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Mehdi");
        comment.setText("Hello World!");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
