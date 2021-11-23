package com.mehdisarf.scenario.secondandwithspring.diwithfieldinj.demo;

import com.mehdisarf.scenario.secondandwithspring.diwithfieldinj.config.ProjectConfig;
import com.mehdisarf.scenario.secondandwithspring.diwithfieldinj.model.Comment;
import com.mehdisarf.scenario.secondandwithspring.diwithfieldinj.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Mehdi");
        comment.setText("Hello Spring World!");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
