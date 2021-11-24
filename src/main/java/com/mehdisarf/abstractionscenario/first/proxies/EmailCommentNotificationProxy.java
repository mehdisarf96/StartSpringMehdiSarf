package com.mehdisarf.abstractionscenario.first.proxies;

import com.mehdisarf.abstractionscenario.first.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
