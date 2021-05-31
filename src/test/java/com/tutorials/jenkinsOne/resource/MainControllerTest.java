package com.tutorials.jenkinsOne.resource;

import com.sun.tools.javac.Main;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {

    private static Logger logger = LoggerFactory.getLogger(MainControllerTest.class);

    // Unit Test
    @Test
    void getMessage() {
        MainController mainController = new MainController();
        logger.info("Started getMessage() Test");
        ResponseEntity<?> message = mainController.getMessage();
        assertEquals("Welcome to Jenkins", message.getBody());
        logger.info("Ended getMessage() Test");
    }
}