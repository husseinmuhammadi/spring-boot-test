package com.javastudio.tutorial.resources;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * In an application with multiple controllers, you can even ask for only one to be instantiated by using
 */
@WebMvcTest(ProductResource.class)
class ProductResourceTest {
    @Autowired
    private MockMvc mockMvc;

    void givenProductController_whenGetListOfProducts_thenItShouldWorks() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/products"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("No product found!")));
    }
}