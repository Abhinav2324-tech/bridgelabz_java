package com.bridgelabz.java_tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Testing started");
    }

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
        System.out.println("Calculator object created");
    }

    @Test
    void testAddition() {

        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {

        int result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    void testMultiplication() {

        int result = calculator.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void testDivision() {

        int result = calculator.divide(10, 5);

        assertEquals(2, result);
    }

    @Test
    void testDivisionByZero() {

        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
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