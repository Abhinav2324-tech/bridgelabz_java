package com.bridgelabz.java_junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringServiceTest {

    StringService stringService;

    @BeforeAll
    static void beforeAll() {
        System.out.println("StringService testing started");
    }

    @BeforeEach
    void beforeEach() {
        stringService = new StringService();
        System.out.println("StringService object created");
    }

    @Test
    void testToUpperCase() {

        String result = stringService.toUpperCase("hello");

        assertEquals("HELLO", result);
    }

    @Test
    void testStringLength() {

        int result = stringService.getLength("hello");

        assertEquals(5, result);
    }

    @Test
    void testReverseString() {

        String result = stringService.reverse("java");

        assertEquals("avaj", result);
    }

    @Test
    void testNullInput() {

        assertThrows(
                IllegalArgumentException.class,
                () -> stringService.toUpperCase(null)
        );
    }

    @Test
    void testEmptyString() {

        int result = stringService.getLength("");

        assertEquals(0, result);
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All StringService tests completed");
    }
}