package com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimplwithqualifier.repositories;

import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimplwithqualifier.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
