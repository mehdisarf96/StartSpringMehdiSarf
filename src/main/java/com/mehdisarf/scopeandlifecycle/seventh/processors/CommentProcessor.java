package com.mehdisarf.scopeandlifecycle.seventh.processors;

import com.mehdisarf.scopeandlifecycle.seventh.model.Comment;
import com.mehdisarf.scopeandlifecycle.seventh.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    // These two methods alter the value of the Comment attribute.
    public void processComment() {

    }

    public void validateComment() {

    }
}
