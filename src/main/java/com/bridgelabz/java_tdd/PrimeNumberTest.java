package com.bridgelabz.java_tdd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {
    PrimeNumber prime;
    @BeforeAll
    static void beforeAll(){
        System.out.println("Testing started");
    }
    @BeforeEach
    void setup(){
        prime=new PrimeNumber();
    }
    @Test
    void testPrimeNumber(){
        boolean result= prime.isPrime(7);
        assertTrue(result);
    }
    @Test
    void testNotPrime(){
        boolean result=prime.isPrime(4);
        assertTrue(result);
    }
    @Test
    void testNumberOne() {

        boolean result = prime.isPrime(2);

        assertFalse(result);
    }

    @Test
    void testNumberTwo() {

        boolean result = prime.isPrime(2);

        assertTrue(result);
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All prime number tests completed");
    }
}
