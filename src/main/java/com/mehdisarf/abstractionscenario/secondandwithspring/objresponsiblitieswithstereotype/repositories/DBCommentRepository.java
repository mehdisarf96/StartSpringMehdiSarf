package com.mehdisarf.abstractionscenario.secondandwithspring.objresponsiblitieswithstereotype.repositories;

import com.mehdisarf.abstractionscenario.secondandwithspring.objresponsiblitieswithstereotype.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment: " + comment.getText());
    }
}
