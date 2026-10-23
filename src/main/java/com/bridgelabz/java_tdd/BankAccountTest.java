package com.bridgelabz.java_tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {
    BankAccount bank;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Testing started");
    }
    @BeforeEach
    void setup(){
        bank=new BankAccount(1000);
    }
    @Test
    void testValidDeposit(){
        assertDoesNotThrow(()->bank.deposit(-100));
        assertEquals(1500,bank.getBalance());
    }
    @Test
    void testInvalidDeposit(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,()->bank.deposit(-200));
        assertEquals("Invalid deposit amount",exception.getMessage());
    }
    @Test
    void testValidWithdraw(){
        assertDoesNotThrow(()->bank.withdraw(500));
        assertEquals(500,bank.getBalance());
    }
    @Test
    void testInvalidWithdraw(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()->bank.withdraw(-200));
        assertEquals("Invalid withdraw amount",exception.getMessage());
    }
    @Test
    void testInsufficientBalance(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
                ()->bank.withdraw(1500));
        assertEquals("Insufficient balance",exception.getMessage());
    }
    @AfterEach
    void afterEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All BankAccount tests completed");
    }
}
