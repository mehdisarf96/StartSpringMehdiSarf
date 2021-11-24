package com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.demo;

import com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.config.ProjectConfig;
import com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.model.Comment;
import com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.services.CommentService;
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
