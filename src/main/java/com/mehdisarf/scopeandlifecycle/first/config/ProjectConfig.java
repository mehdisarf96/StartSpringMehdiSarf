package com.mehdisarf.scopeandlifecycle.first.config;

import com.mehdisarf.scopeandlifecycle.first.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}