package com.mehdisarf.aop.sixth.services;

import com.mehdisarf.aop.sixth.aspects.ToLog;
import com.mehdisarf.aop.sixth.model.Comment;
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
