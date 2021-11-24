package com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.services;

import com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.model.Comment;
import com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.proxies.CommentNotificationProxy;
import com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(
            CommentRepository commentRepository,
            @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
