package com.javastudio.tutorial.swagger;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SwaggerDocumentationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void givenSwaggerDocumentation_whenSwaggerUi_thenItShouldWork() {
        String uri = String.format("http://localhost:%d/swagger-ui.html", port);
        Assertions.assertThat(restTemplate.getForObject(uri, String.class)).contains("<html");
    }
}
