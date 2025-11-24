package com.fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Step definitions for the FizzBuzz Gherkin scenarios.
 */
public class FizzBuzzSteps {
    
    private FizzBuzz fizzbuzz;
    private String result;
    private Exception exception;
    
    @Given("I have a FizzBuzz instance")
    public void i_have_a_fizzbuzz_instance() {
        fizzbuzz = new FizzBuzz();
        exception = null;
    }
    
    @When("I apply fizzbuzz to number {int}")
    public void i_apply_fizzbuzz_to_number(int number) {
        try {
            result = fizzbuzz.fizzbuzz(number);
        } catch (Exception e) {
            exception = e;
        }
    }
    
    @When("I apply fizzbuzz to a negative number {int}")
    public void i_apply_fizzbuzz_to_negative_number(int number) {
        try {
            result = fizzbuzz.fizzbuzz(number);
        } catch (Exception e) {
            exception = e;
        }
    }
    
    @When("I apply fizzbuzz to zero")
    public void i_apply_fizzbuzz_to_zero() {
        try {
            result = fizzbuzz.fizzbuzz(0);
        } catch (Exception e) {
            exception = e;
        }
    }
    
    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
    
    @Then("an IllegalArgumentException should be thrown")
    public void an_illegal_argument_exception_should_be_thrown() {
        assertEquals(IllegalArgumentException.class, exception.getClass());
    }
}
