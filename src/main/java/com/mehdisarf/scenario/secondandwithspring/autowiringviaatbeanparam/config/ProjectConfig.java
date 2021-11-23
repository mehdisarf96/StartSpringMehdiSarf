package com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.config;

import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.proxies.CommentNotificationProxy;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.proxies.EmailCommentNotificationProxy;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.repositories.CommentRepository;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.repositories.DBCommentRepository;
import com.mehdisarf.scenario.secondandwithspring.autowiringviaatbeanparam.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    // We use parameters of the @Bean method to instruct Spring to provide references for
    // beans from its context, compatible with the type of the parameters.
    public CommentService commentService(
            CommentNotificationProxy commentNotificationProxy,
            CommentRepository commentRepository) {

        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
