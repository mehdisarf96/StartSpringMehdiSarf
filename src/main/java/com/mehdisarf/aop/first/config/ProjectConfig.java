package com.mehdisarf.aop.first.config;

import com.mehdisarf.aop.first.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mehdisarf.aop.first")
public class ProjectConfig {
}