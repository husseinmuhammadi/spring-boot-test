package com.javastudio.tutorial.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "security.policy.password.complexity")
public class PasswordComplexityConfiguration {
    private int minLength;

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
}
