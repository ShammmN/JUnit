/*
* Name: JUnit Calculator lab 
* Purpose: Build a comprehensive JUnit 5 test suite that covers normal operation, edge cases, and error conditions to implement basic opertations. 
* Programmer: Sham Nemer
* Date: 04 / 10 / 2026
*/

/* 
*This class defines a simple calculator with basic arithmetic operations 
*(addition, subtraction, multiplication, division) 
* and mathematical functions (power and square root). 
* Each method performs the specified operation and includes error handling for invalid inputs, 
* such as division by zero and taking the square root of a negative number.
*/
public class calculator {
    // Basic arithmetic operations
    // Created the add method that takes two double parameters and returns their sum.
    public double add(double a, double b) {
        return a + b;
    }   
    // Created the subtract method that takes two double parameters and returns their difference.
    public double subtract(double a, double b) {
        return a - b;
    }
    // Created the multiply method that takes two double parameters and returns their product.
    public double multiply(double a, double b) {
        return a * b;
    }
    // Created the divide method that takes two double parameters and returns their quotient and also checks for division by zero.
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    // Basic mathematical functions
    // Created the power method that takes a double base and an integer exponent and returns the result of raising the base to the power of the exponent.
    public double power(double base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("Exponent cannot be negative");
        }
        return Math.pow(base, exp);
    }
    // Created the sqrt method that takes a double parameter and returns its square root, while also checking for negative input.
    public double sqrt(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot take square root of a negative number");
        }
        return Math.sqrt(n);
    }
}
