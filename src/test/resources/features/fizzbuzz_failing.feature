Feature: FizzBuzz Failing Cases
  As a developer
  I want to test edge cases and error scenarios
  So that I can ensure the FizzBuzz implementation handles failures correctly

  Scenario: Negative number should throw exception
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to a negative number -5
    Then an IllegalArgumentException should be thrown

  Scenario: Zero should throw exception
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to zero
    Then an IllegalArgumentException should be thrown

  Scenario: Very large number divisible by 3
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number 999999
    Then the result should be "Fizz"

  Scenario: Very large number divisible by 5
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number 1000000
    Then the result should be "Buzz"

  Scenario: Very large number divisible by 15
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number 1000005
    Then the result should be "FizzBuzz"

  Scenario: Prime number returns itself
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number 17
    Then the result should be "17"

  Scenario: Prime number 97 returns itself
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number 97
    Then the result should be "97"

  Scenario Outline: Multiple negative numbers should fail
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to a negative number <number>
    Then an IllegalArgumentException should be thrown

    Examples:
      | number |
      | -1     |
      | -3     |
      | -15    |
      | -100   |
      | -999   |

  Scenario Outline: Boundary numbers that are multiples of 3
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number <number>
    Then the result should be "Fizz"

    Examples:
      | number |
      | 3      |
      | 33     |
      | 333    |
      | 3333   |

  Scenario Outline: Boundary numbers that are multiples of 5
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number <number>
    Then the result should be "Buzz"

    Examples:
      | number |
      | 5      |
      | 55     |
      | 555    |
      | 5555   |

  Scenario Outline: Boundary numbers that are multiples of 15
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number <number>
    Then the result should be "FizzBuzz"

    Examples:
      | number |
      | 15     |
      | 150    |
      | 1500   |
      | 15000  |

  Scenario Outline: Numbers with all digits returning themselves
    Given I have a FizzBuzz instance
    When I apply fizzbuzz to number <number>
    Then the result should be "<expected>"

    Examples:
      | number | expected |
      | 1      | 1        |
      | 2      | 2        |
      | 4      | 4        |
      | 7      | 7        |
      | 8      | 8        |
      | 11     | 11       |
      | 13     | 13       |
      | 14     | 14       |
      | 16     | 16       |
      | 17     | 17       |
      | 19     | 19       |
      | 22     | 22       |
      | 23     | 23       |
      | 26     | 26       |
      | 28     | 28       |
      | 29     | 29       |
      | 31     | 31       |
      | 32     | 32       |
      | 34     | 34       |
      | 37     | 37       |
      | 38     | 38       |
      | 41     | 41       |
      | 43     | 43       |
      | 44     | 44       |
      | 46     | 46       |
      | 47     | 47       |
      | 49     | 49       |
