package com.mehdisarf.abstractionscenario.first.repositories;

import com.mehdisarf.abstractionscenario.first.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
