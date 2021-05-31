package com.tutorials.jenkinsOne.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsUnitTests {

    MathUtils utils;

    // BeforeAll and AfterAll lifecycle hooks have to be static

    @BeforeEach
    void init() {
        utils = new MathUtils();
    }

    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning up....");
    }

    @Test
    void add() {
        int expected = 2;
        int actual = utils.add(1, 1);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793, utils.computeCircleArea(10), "Circle area is not as expected");
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class, () -> utils.divide(1, 0), "Divide By 0 is not allowed");
    }
}