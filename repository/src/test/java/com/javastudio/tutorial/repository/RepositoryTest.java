package com.javastudio.tutorial.repository;

import com.javastudio.tutorial.entity.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    void itShouldBeInContext() {
        Assertions.assertThat(repository).isNotNull();
    }

    @Tag("automatic-rollback-of-transactions-in-spring-tests")
    @Test
    void saveAnEntityInDatabase() {
        assertThat(repository.count()).isEqualTo(0);
        repository.save(new Product("Laptop"));
        assertThat(repository.count()).isEqualTo(1);
    }

    @Tag("automatic-rollback-of-transactions-in-spring-tests")
    @Test
    void saveAnEntityInDatabase2() {
        assertThat(repository.count()).isEqualTo(0);
        repository.save(new Product("Mobile"));
        assertThat(repository.count()).isEqualTo(1);
    }
}
