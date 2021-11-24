package com.mehdisarf.abstractionscenario.secondandwithspring.diwithconsinj.repositories;

import com.mehdisarf.abstractionscenario.secondandwithspring.diwithconsinj.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
