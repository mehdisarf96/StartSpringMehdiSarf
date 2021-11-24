package com.mehdisarf.abstractionscenario.first.demo;

import com.mehdisarf.abstractionscenario.first.model.Comment;
import com.mehdisarf.abstractionscenario.first.proxies.CommentNotificationProxy;
import com.mehdisarf.abstractionscenario.first.proxies.EmailCommentNotificationProxy;
import com.mehdisarf.abstractionscenario.first.repositories.CommentRepository;
import com.mehdisarf.abstractionscenario.first.repositories.DBCommentRepository;
import com.mehdisarf.abstractionscenario.first.services.CommentService;

public class Demo {
    public static void main(String[] args) {

        // Creates the instance for the dependencies
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        // Creates the instance of the service class and providing the dependencies
        CommentService service = new CommentService(commentRepository,commentNotificationProxy);

        // Creates an instance of comment to send as a parameter to the publish comment use case
        Comment comment = new Comment();
        comment.setAuthor("Mehdi");
        comment.setText("Such a great Movie.");

        // Calls the publish comment use case
        service.publishComment(comment);

    }
}
