package com.mehdisarf.abstractionscenario.first.services;

import com.mehdisarf.abstractionscenario.first.model.Comment;
import com.mehdisarf.abstractionscenario.first.proxies.CommentNotificationProxy;
import com.mehdisarf.abstractionscenario.first.repositories.CommentRepository;

public class CommentService {

    // We define the two dependencies as attributes of the class
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    // We implement the use case that delegates the “store comment”
    // and “send notification” responsibilities to the dependencies.
    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
