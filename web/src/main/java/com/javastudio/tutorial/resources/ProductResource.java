package com.javastudio.tutorial.resources;

import com.javastudio.tutorial.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public String findProducts() {
        return service.findProducts();
    }
}
