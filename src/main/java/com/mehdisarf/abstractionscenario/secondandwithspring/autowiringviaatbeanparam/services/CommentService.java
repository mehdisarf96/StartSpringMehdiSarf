package com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.services;

import com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;
import com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.proxies.CommentNotificationProxy;
import com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.repositories.CommentRepository;

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
