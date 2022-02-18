package com.javastudio.tutorial.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private EntityManager em;

    @Test
    void shouldLoadEntityManagerInContext() {
        assertNotNull(em);
    }
}