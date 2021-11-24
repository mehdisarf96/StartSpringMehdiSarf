package com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimpl.services;

import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimpl.model.Comment;
import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimpl.proxies.CommentNotificationProxy;
import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimpl.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
