package com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.proxies;

import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;
import org.springframework.stereotype.Component;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
