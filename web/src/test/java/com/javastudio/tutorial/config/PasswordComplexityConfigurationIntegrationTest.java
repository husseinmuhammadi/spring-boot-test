package com.javastudio.tutorial.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@SpringBootTest
@DisplayName("This is an integration test!")
class PasswordComplexityConfigurationIntegrationTest {

    @Autowired
    private PasswordComplexityConfiguration passwordComplexityConfiguration;

    @Test
    void givenTestEnvironment_whenQueryPasswordComplexity_thenItShouldReturnEight() {
        assertThat(passwordComplexityConfiguration.getMinLength()).isEqualTo(8);
    }
}