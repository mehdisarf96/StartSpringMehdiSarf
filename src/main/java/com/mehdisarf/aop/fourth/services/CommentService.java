package com.mehdisarf.aop.fourth.services;

import com.mehdisarf.aop.fourth.aspects.ToLog;
import com.mehdisarf.aop.fourth.model.Comment;
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
