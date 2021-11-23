package com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.proxies;

import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
