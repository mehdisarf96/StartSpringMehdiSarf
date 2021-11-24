package com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.proxies;

import com.mehdisarf.abstractionscenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
