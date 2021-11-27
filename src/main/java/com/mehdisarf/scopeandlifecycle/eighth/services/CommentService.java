package com.mehdisarf.scopeandlifecycle.eighth.services;

import com.mehdisarf.scopeandlifecycle.eighth.model.Comment;
import com.mehdisarf.scopeandlifecycle.eighth.processors.CommentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    // Spring injects this bean when creating the CommentService bean.
    // But because CommentService is singleton, Spring will also create and
    // inject the CommentProcessor just once.
    private CommentProcessor processor;

    public void sendComment(Comment comment) {

        processor.setComment(comment);
        processor.processComment();
        processor.validateComment();

        comment = processor.getComment();
        //...
    }
}
