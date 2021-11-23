package com.mehdisarf.scenario.first.proxies;

import com.mehdisarf.scenario.first.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
