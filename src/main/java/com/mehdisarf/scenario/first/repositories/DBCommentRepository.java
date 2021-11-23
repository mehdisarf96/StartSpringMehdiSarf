package com.mehdisarf.scenario.first.repositories;

import com.mehdisarf.scenario.first.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
