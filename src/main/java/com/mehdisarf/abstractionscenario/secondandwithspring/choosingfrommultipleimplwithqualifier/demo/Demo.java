package com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimplwithqualifier.demo;

import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimplwithqualifier.config.ProjectConfig;
import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimplwithqualifier.model.Comment;
import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimplwithqualifier.services.CommentService;
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
