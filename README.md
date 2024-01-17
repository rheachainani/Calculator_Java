# Calculator_Java
Calculator program written in Java to perform mathematical functions on pair of numbers and arrays.

## Files

1. **Calculator.java**
   - Contains methods for basic arithmetic operations (addition, subtraction, multiplication, division).
   - Implements statistical operations such as finding the sum, mean, median, mode, variance, and standard deviation of an array of integers.

2. **UserInput.java**
   - Handles user input for two numbers and arrays of integers.
   - Provides methods to input two numbers and an array of integers with user prompts.
   - Ensures proper resource management by closing the Scanner instance after input.

3. **Main.java**
   - Implements a simple command-line interface for the calculator application.
   - Displays a menu for the user to choose between operations on two numbers or statistical operations on an array.
   - Performs calculations based on user input by utilizing the Calculator and UserInput classes.

## Functions

### Mathematical Operations

1. **add**
- Parameters: num1 (int), num2 (int)
- Returns the sum of two numbers.

2. **subtract**
- Parameters: num1 (int), num2 (int)
- Returns the result of subtracting num2 from num1.

3. **multiply**
- Parameters: num1 (int), num2 (int)
- Returns the product of two numbers.

4. **divide**
- Parameters: num1 (int), num2 (int)
- Returns the result of dividing num1 by num2. Handles division by zero and returns Double.NaN in such cases.

### Statistical Operations

5. **findSum**
- Parameters: array (int[]), n (int)
- Returns the sum of elements in an array.

6. **findMean**
- Parameters: array (int[]), n (int)
- Returns the mean (average) of elements in an array.

7. **findMedian**
- Parameters: array (int[]), n (int)
- Returns the median of elements in a sorted array.

8. **findMode**
- Parameters: array (int[]), n (int)
- Returns the mode (most frequently occurring element) in an array.

9. **findVariance**
- Parameters: array (int[]), n (int)
- Returns the variance of elements in an array.

10. **findStandardDeviation**
- Parameters: array (int[]), n (int)
- Returns the standard deviation of elements in an array.

### User Input Functions

1. **inputNumbers**
- Prompts the user to enter two numbers.
- Returns an array of two integers.

2. **inputArray**
- Parameters: size (int)
- Prompts the user to enter elements for an array of a specified size.
- Returns an array of integers.

### main function
- The main entry point of the application.
- Displays a menu for the user to choose between arithmetic operations on two numbers or statistical operations on an array.
- Utilizes Calculator and UserInput classes to perform calculations based on user input.
