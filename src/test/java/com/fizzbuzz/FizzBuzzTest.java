package com.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the FizzBuzz class.
 */
public class FizzBuzzTest {
    
    private FizzBuzz fizzbuzz;
    
    @BeforeEach
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }
    
    // Tests for Fizz (divisible by 3 only)
    @Test
    public void testFizz_3() {
        assertEquals("Fizz", fizzbuzz.fizzbuzz(3));
    }
    
    @Test
    public void testFizz_6() {
        assertEquals("Fizz", fizzbuzz.fizzbuzz(6));
    }
    
    @Test
    public void testFizz_9() {
        assertEquals("Fizz", fizzbuzz.fizzbuzz(9));
    }
    
    // Tests for Buzz (divisible by 5 only)
    @Test
    public void testBuzz_5() {
        assertEquals("Buzz", fizzbuzz.fizzbuzz(5));
    }
    
    @Test
    public void testBuzz_10() {
        assertEquals("Buzz", fizzbuzz.fizzbuzz(10));
    }
    
    @Test
    public void testBuzz_20() {
        assertEquals("Buzz", fizzbuzz.fizzbuzz(20));
    }
    
    // Tests for FizzBuzz (divisible by both 3 and 5)
    @Test
    public void testFizzBuzz_15() {
        assertEquals("FizzBuzz", fizzbuzz.fizzbuzz(15));
    }
    
    @Test
    public void testFizzBuzz_30() {
        assertEquals("FizzBuzz", fizzbuzz.fizzbuzz(30));
    }
    
    @Test
    public void testFizzBuzz_45() {
        assertEquals("FizzBuzz", fizzbuzz.fizzbuzz(45));
    }
    
    // Tests for regular numbers
    @Test
    public void testNumber_1() {
        assertEquals("1", fizzbuzz.fizzbuzz(1));
    }
    
    @Test
    public void testNumber_2() {
        assertEquals("2", fizzbuzz.fizzbuzz(2));
    }
    
    @Test
    public void testNumber_4() {
        assertEquals("4", fizzbuzz.fizzbuzz(4));
    }
    
    @Test
    public void testNumber_7() {
        assertEquals("7", fizzbuzz.fizzbuzz(7));
    }
    
    @Test
    public void testNumber_22() {
        assertEquals("22", fizzbuzz.fizzbuzz(22));
    }
    
    // Tests for invalid input
    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> fizzbuzz.fizzbuzz(-5));
    }
    
    @Test
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> fizzbuzz.fizzbuzz(0));
    }
}
