package com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.repositories;

import com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
