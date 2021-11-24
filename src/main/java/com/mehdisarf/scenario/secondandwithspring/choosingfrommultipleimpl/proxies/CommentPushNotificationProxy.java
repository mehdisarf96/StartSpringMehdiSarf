package com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimpl.proxies;

import com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimpl.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
