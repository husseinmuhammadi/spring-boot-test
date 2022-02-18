package com.javastudio.tutorial.listener;

import com.javastudio.tutorial.config.PasswordComplexityConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {

    private Logger logger = LoggerFactory.getLogger(ApplicationReadyEventListener.class);

    @Autowired
    private PasswordComplexityConfiguration cfg;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("security policy password complexity - min length: {}", cfg.getMinLength());
    }
}
