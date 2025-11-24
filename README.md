yanis bouchaib
adel hammiche

# FizzBuzz

A Java implementation of the classic FizzBuzz algorithm using Maven.

## Requirements

- Java 11+
- Maven 3.6+

## Building the project

```bash
mvn clean compile
```

## Running tests

```bash
mvn test
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

## Project structure

```
src/main/java/com/fizzbuzz/FizzBuzz.java          # Main class
src/test/java/com/fizzbuzz/FizzBuzzTest.java      # Unit tests
pom.xml                                            # Maven configuration
```
