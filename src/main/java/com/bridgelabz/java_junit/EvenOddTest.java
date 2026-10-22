package com.bridgelabz.java_junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    EvenOdd evenOdd;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Even/Odd testing started");
    }

    @BeforeEach
    void beforeEach() {
        evenOdd = new EvenOdd();
        System.out.println("EvenOdd object created");
    }

    @Test
    void testEvenNumber() {

        boolean result = evenOdd.isEven(10);

        assertTrue(result);
    }

    @Test
    void testOddNumber() {

        boolean result = evenOdd.isOdd(7);

        assertTrue(result);
    }

    @Test
    void testZeroIsEven() {

        boolean result = evenOdd.isEven(0);

        assertTrue(result);
    }

    @Test
    void testNegativeOddNumber() {

        boolean result = evenOdd.isOdd(-5);

        assertTrue(result);
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All Even/Odd tests completed");
    }
}