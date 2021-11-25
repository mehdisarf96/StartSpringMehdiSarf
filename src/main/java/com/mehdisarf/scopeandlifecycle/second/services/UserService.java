package com.mehdisarf.scopeandlifecycle.second.services;

import com.mehdisarf.scopeandlifecycle.second.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Making the field final highlights that this field was intended not to be changed. (immutable)
    private final CommentRepository commentRepository;

    // replace the field injection with constructor injection.
    @Autowired
    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
