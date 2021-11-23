package com.mehdisarf.scenario.first.demo;

import com.mehdisarf.scenario.first.model.Comment;
import com.mehdisarf.scenario.first.proxies.CommentNotificationProxy;
import com.mehdisarf.scenario.first.proxies.EmailCommentNotificationProxy;
import com.mehdisarf.scenario.first.repositories.CommentRepository;
import com.mehdisarf.scenario.first.repositories.DBCommentRepository;
import com.mehdisarf.scenario.first.services.CommentService;

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
