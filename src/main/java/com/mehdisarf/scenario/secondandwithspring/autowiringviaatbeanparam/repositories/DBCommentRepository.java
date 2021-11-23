package com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.repositories;

import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;
import org.springframework.stereotype.Component;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
