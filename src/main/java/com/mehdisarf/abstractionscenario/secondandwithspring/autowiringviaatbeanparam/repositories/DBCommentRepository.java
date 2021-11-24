package com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.repositories;

import com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
