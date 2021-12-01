package com.mehdisarf.aop.third.services;

import com.mehdisarf.aop.third.aspects.ToLog;
import com.mehdisarf.aop.third.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {

        logger.info("Publishing Comment: " + comment.getText());
        return "SUCCESS";
    }

    @ToLog // we mark this method using the custom annotation.
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment:" + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
