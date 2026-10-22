package com.bridgelabz.java_junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberTest {

    MaximumNumber maximumNumber;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Maximum number testing started");
    }

    @BeforeEach
    void beforeEach() {
        maximumNumber = new MaximumNumber();
        System.out.println("MaximumNumber object created");
    }

    @Test
    void testFirstNumberIsMaximum() {

        int result = maximumNumber.findMaximum(30, 20, 10);

        assertEquals(30, result);
    }

    @Test
    void testSecondNumberIsMaximum() {

        int result = maximumNumber.findMaximum(10, 40, 20);

        assertEquals(40, result);
    }

    @Test
    void testThirdNumberIsMaximum() {

        int result = maximumNumber.findMaximum(10, 20, 50);

        assertEquals(50, result);
    }

    @Test
    void testEqualMaximumNumbers() {

        int result = maximumNumber.findMaximum(25, 25, 10);

        assertEquals(25, result);
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All tests completed");
    }
}