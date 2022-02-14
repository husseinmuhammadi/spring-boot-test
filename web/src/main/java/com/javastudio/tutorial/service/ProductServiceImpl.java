package com.javastudio.tutorial.service;

import com.javastudio.tutorial.api.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public String findProducts() {
        return "Product not found!";
    }
}
