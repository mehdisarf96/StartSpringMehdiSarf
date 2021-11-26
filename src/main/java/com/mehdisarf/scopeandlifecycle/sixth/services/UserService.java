package com.mehdisarf.scopeandlifecycle.sixth.services;

import com.mehdisarf.scopeandlifecycle.sixth.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
