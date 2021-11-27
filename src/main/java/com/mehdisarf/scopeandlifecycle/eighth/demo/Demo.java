package com.mehdisarf.scopeandlifecycle.eighth.demo;

import com.mehdisarf.scopeandlifecycle.eighth.config.ProjectConfig;
import com.mehdisarf.scopeandlifecycle.eighth.model.Comment;
import com.mehdisarf.scopeandlifecycle.eighth.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = c.getBean(CommentService.class);

        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}
