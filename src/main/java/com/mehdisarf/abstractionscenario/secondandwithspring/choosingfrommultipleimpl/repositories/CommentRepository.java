package com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimpl.repositories;

import com.mehdisarf.abstractionscenario.secondandwithspring.choosingfrommultipleimpl.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
