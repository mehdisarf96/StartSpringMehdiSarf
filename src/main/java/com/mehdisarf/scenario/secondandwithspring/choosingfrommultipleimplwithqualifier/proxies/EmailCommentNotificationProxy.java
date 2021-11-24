package com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.proxies;

import com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// Using @Qualifier, we name this implementation “EMAIL”.
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
