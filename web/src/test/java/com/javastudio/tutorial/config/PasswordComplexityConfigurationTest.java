package com.javastudio.tutorial.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("prod")
@SpringBootTest
class PasswordComplexityConfigurationTest {

    @Autowired
    private PasswordComplexityConfiguration passwordComplexityConfiguration;

    @Test
    void givenProdEnvironment_whenQueryPasswordComplexity_thenItShouldReturnEight() {
        assertThat(passwordComplexityConfiguration.getMinLength()).isEqualTo(8);
    }
}