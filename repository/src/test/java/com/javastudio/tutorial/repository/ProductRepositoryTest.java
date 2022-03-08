package com.javastudio.tutorial.repository;

import com.javastudio.tutorial.entity.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private EntityManager em;

    @Autowired
    private ProductRepository productRepository;

    @Test
    void shouldLoadEntityManagerInContext() {
        assertNotNull(em);
    }

    @Test
    void shouldGenerateNewId() {
        Assertions.assertThat(productRepository.save(new Product("Laptop")).getId()).isNotNull();
    }

    @Test
    void shouldSaveWithNewGeneratedId() {
        Product product = new Product();
        product.setId(100L);
        product.setName("Laptop");

        Assertions.assertThat(productRepository.save(product).getId()).isEqualTo(1L);
        Assertions.assertThat(productRepository.save(product).getId()).isNotEqualTo(100L);
    }
}