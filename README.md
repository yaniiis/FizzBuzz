yanis bouchaib
adel hammiche

# FizzBuzz

A Java implementation of the classic FizzBuzz algorithm using Maven with both unit tests and BDD acceptance tests.

## Requirements

- Java 11+
- Maven 3.6+

## Building the project

```bash
mvn clean compile
```

## Running tests

### Run all tests (JUnit + Gherkin/Cucumber)
```bash
mvn test
```

### Run only JUnit tests
```bash
mvn test -Dtest=FizzBuzzTest
```

### Run only Gherkin/Cucumber tests
```bash
mvn test -Dtest=RunCucumberTest
```

## How it works

The `FizzBuzz` class implements the following rules:
- If the number is divisible by **both 3 and 5**, return `"FizzBuzz"`
- If the number is divisible by **3**, return `"Fizz"`
- If the number is divisible by **5**, return `"Buzz"`
- Otherwise, return the string representation of the number

### Example

```java
FizzBuzz fb = new FizzBuzz();
fb.fizzbuzz(3);   // "Fizz"
fb.fizzbuzz(5);   // "Buzz"
fb.fizzbuzz(15);  // "FizzBuzz"
fb.fizzbuzz(7);   // "7"
```

## Test Coverage

- **JUnit Tests** (`FizzBuzzTest.java`): 16 unit tests covering all scenarios
- **Gherkin/Cucumber Tests** (`fizzbuzz.feature`): 100 acceptance tests covering numbers 1-100

### Test Examples

| Input | Expected Output |
|-------|-----------------|
| 1     | "1"             |
| 3     | "Fizz"          |
| 5     | "Buzz"          |
| 15    | "FizzBuzz"      |
| 100   | "Buzz"          |

## Project structure

```
src/main/java/com/fizzbuzz/FizzBuzz.java                   # Main class
src/test/java/com/fizzbuzz/FizzBuzzTest.java               # JUnit unit tests (16 tests)
src/test/java/com/fizzbuzz/FizzBuzzSteps.java              # Gherkin step definitions
src/test/java/com/fizzbuzz/RunCucumberTest.java            # Cucumber test runner
src/test/resources/features/fizzbuzz.feature               # Gherkin scenarios (100 examples)
pom.xml                                                     # Maven configuration
```
