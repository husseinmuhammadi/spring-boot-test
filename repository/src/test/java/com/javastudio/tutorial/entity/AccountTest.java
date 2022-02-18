package com.javastudio.tutorial.entity;

import com.javastudio.tutorial.repository.AccountRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.UUID;

@DataJpaTest
class AccountTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void shouldNotBeNull() {
        Assertions.assertThat(accountRepository).isNotNull();
    }

    @Test
    void whenSaveAccount_thenIdShouldBeGenerated() {
        Account account = new Account("NL89RABO0123456789");
        Assertions.assertThat(accountRepository.save(account).getId()).isNotNull();
    }

    @Test
    void name() {
        UUID accountId = UUID.randomUUID();
        Account account = new Account("NL89RABO0123456789");
        account.setId(accountId);
//        Assertions.assertThat(accountRepository.save(account).getId()).isEqualTo(accountId);
    }
}