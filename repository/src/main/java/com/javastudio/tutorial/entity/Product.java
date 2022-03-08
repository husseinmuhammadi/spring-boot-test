package com.javastudio.tutorial.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@SequenceGenerator(name = "SEQUENCE_GENERATOR", sequenceName = "SEQ_PRODUCT")
public class Product {

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
