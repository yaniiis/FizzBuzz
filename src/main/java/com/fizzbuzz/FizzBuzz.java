package com.fizzbuzz;

/**
 * FizzBuzz class that implements the classic FizzBuzz algorithm.
 * 
 * Rules:
 * - If n is divisible by both 3 and 5, return "FizzBuzz"
 * - If n is divisible by 3, return "Fizz"
 * - If n is divisible by 5, return "Buzz"
 * - Otherwise, return the string representation of n
 */
public class FizzBuzz {
    
    /**
     * Applies the FizzBuzz algorithm to the given positive integer.
     * 
     * @param n a positive integer
     * @return the FizzBuzz result according to the rules
     * @throws IllegalArgumentException if n is not positive
     */
    public String fizzbuzz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }
        
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}
