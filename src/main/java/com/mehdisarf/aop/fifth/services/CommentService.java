package com.mehdisarf.aop.fifth.services;

import com.mehdisarf.aop.fifth.aspects.ToLog;
import com.mehdisarf.aop.fifth.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {

        logger.info("Publishing Comment: " + comment.getText());
        return "SUCCESS";
    }
}
