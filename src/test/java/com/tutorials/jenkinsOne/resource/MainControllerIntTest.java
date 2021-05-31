package com.tutorials.jenkinsOne.resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MainController.class)
class MainControllerIntTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMessage() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("Welcome to Jenkins", result.getResponse().getContentAsString());
    }
}