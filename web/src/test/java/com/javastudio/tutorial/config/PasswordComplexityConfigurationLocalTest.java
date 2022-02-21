package com.javastudio.tutorial.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("local")
@SpringBootTest
@DisplayName("This test is just for running the test on local environment!")
class PasswordComplexityConfigurationLocalTest {

    @Autowired
    private PasswordComplexityConfiguration passwordComplexityConfiguration;

    @Test
    void givenLocalEnvironment_whenQueryPasswordComplexity_thenItShouldReturnFour() {
        assertThat(passwordComplexityConfiguration.getMinLength()).isEqualTo(4);
    }
}