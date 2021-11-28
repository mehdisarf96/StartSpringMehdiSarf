package com.mehdisarf.aop.first.config;

import com.mehdisarf.aop.first.aspects.LoggingAspect;
import com.mehdisarf.aop.first.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.mehdisarf.aop.first")
@EnableAspectJAutoProxy // Enable the aspect mechanism
public class ProjectConfig {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}