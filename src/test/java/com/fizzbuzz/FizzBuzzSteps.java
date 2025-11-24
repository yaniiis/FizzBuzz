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
    
    @Given("I have a FizzBuzz instance")
    public void i_have_a_fizzbuzz_instance() {
        fizzbuzz = new FizzBuzz();
    }
    
    @When("I apply fizzbuzz to number {int}")
    public void i_apply_fizzbuzz_to_number(int number) {
        result = fizzbuzz.fizzbuzz(number);
    }
    
    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}
