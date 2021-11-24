package com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.proxies;

import com.mehdisarf.scenario.secondandwithspring.choosingfrommultipleimplwithqualifier.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// Using @Qualifier, we name this implementation “PUSH”.
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
