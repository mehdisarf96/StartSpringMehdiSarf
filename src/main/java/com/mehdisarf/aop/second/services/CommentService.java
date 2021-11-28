package com.mehdisarf.aop.second.services;

import com.mehdisarf.aop.second.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {

        logger.info("Publishing Comment: " + comment.getText());
        return "SUCCESS"; // For our demonstration, the method now returns a value.
    }
}
