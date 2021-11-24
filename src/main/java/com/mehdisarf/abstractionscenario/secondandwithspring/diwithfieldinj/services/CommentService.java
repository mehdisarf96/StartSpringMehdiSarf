package com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.services;

import com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.model.Comment;
import com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.proxies.CommentNotificationProxy;
import com.mehdisarf.abstractionscenario.secondandwithspring.diwithfieldinj.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {

        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
