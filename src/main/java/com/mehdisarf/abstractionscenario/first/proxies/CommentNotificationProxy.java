package com.mehdisarf.abstractionscenario.first.proxies;

import com.mehdisarf.abstractionscenario.first.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
