package com.mehdisarf.scopeandlifecycle.seventh.services;

import com.mehdisarf.scopeandlifecycle.seventh.processors.CommentProcessor;
import com.mehdisarf.scopeandlifecycle.seventh.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private AnnotationConfigApplicationContext context;

    public void sendComment(Comment comment) {

        /*
         instead of using this:
         CommentProcessor processor = new CommentProcessor();
         we use this:
         */

        CommentProcessor processor = context.getBean(CommentProcessor.class);
        // A new CommentProcessor instance is always provided here above.

        processor.setComment(comment);
        processor.processComment();
        processor.validateComment();

        comment = processor.getComment();
        //...
    }
}
