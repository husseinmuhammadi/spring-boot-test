package com.javastudio.tutorial.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductResource {

    @GetMapping("/products")
    public String findProducts() {
        return "No product found!";
    }
}
