package com.mehdisarf.scenario.secondandwithspring.diwithfieldinj.repositories;

import com.mehdisarf.scenario.secondandwithspring.diwithfieldinj.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
