package com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.repositories;

import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
