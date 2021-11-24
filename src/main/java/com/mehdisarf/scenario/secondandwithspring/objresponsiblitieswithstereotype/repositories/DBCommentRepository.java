package com.mehdisarf.scenario.secondandwithspring.objresponsiblitieswithstereotype.repositories;

import com.mehdisarf.scenario.secondandwithspring.objresponsiblitieswithstereotype.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
