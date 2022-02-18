package com.javastudio.tutorial.repository;

import com.javastudio.tutorial.entity.Account;
import com.javastudio.tutorial.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
}
