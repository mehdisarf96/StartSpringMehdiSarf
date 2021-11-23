package com.mehdisarf.scenario.secondandwithspring.diwithconsinj.proxies;

import com.mehdisarf.scenario.secondandwithspring.diwithconsinj.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
