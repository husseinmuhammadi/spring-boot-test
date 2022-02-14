package com.javastudio.tutorial.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/index")
    public String index() {
        return "Hello world!";
    }
}
