package com.bridgelabz.java_junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Palindrome testing started");
    }

    @BeforeEach
    void beforeEach() {
        palindromeChecker = new PalindromeChecker();
        System.out.println("PalindromeChecker object created");
    }

    @Test
    void testPalindromeWord() {

        boolean result = palindromeChecker.isPalindrome("madam");

        assertTrue(result);
    }

    @Test
    void testNonPalindromeWord() {

        boolean result = palindromeChecker.isPalindrome("hello");

        assertFalse(result);
    }

    @Test
    void testSingleCharacter() {

        boolean result = palindromeChecker.isPalindrome("a");

        assertTrue(result);
    }

    @Test
    void testAnotherPalindrome() {

        boolean result = palindromeChecker.isPalindrome("level");

        assertTrue(result);
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All palindrome tests completed");
    }
}