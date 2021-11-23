package com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.services;

import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.proxies.CommentNotificationProxy;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CommentService {

    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
