package com.fizzbuzz;

/**
 * FizzBuzz class that implements the classic FizzBuzz algorithm.
 * 
 * Rules:
 * - If n contains digit 3 or is divisible by 3, return "Fizz"
 * - If n contains digit 5 or is divisible by 5, return "Buzz"
 * - If both conditions are true, return "FizzBuzz"
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
        
        String numStr = String.valueOf(n);
        boolean containsOrDivisibleBy3 = numStr.contains("3") || n % 3 == 0;
        boolean containsOrDivisibleBy5 = numStr.contains("5") || n % 5 == 0;
        
        if (containsOrDivisibleBy3 && containsOrDivisibleBy5) {
            return "FizzBuzz";
        } else if (containsOrDivisibleBy3) {
            return "Fizz";
        } else if (containsOrDivisibleBy5) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}
