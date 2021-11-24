package com.mehdisarf.scenario.secondandwithspring.objresponsiblitieswithstereotype.demo;

import com.mehdisarf.scenario.secondandwithspring.objresponsiblitieswithstereotype.config.ProjectConfig;
import com.mehdisarf.scenario.secondandwithspring.objresponsiblitieswithstereotype.model.Comment;
import com.mehdisarf.scenario.secondandwithspring.objresponsiblitieswithstereotype.services.CommentService;
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
