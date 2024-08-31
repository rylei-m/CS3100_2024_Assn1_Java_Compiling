# CS3100 2024 Assn1 Java Compiling
## Rylei Mindrum | A02352206
## Assignment 1
The purpose of this assignment is to get you familiarized with compiling and running a Java program from the command line. 
The specific way this will be done is that you will develop a program that accepts command line arguments to tell it how to 
compute either a Fibonacci number, a factorial, and/or the value of the number 'e'., depending on the input given.
 
## Instructions
Implement a program that computes the Fibonacci of a specified number, the factorial of a specified number, and/or
estimates the value of 'e' using the specified number of iterations (of a Taylor series) based on specific inputs.  
Please feel free to use the Internet to find resources that explain how to estimate the value of 'e' using a Taylor series.

In the case of no or invalid number of parameters, the program should show help instructions that looks like:

--- Assign 1 Help ---
-  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]
-  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]
-  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]

## Example command line usages of the program look like:

- java Assign1 -fib 6
- java Assign1 -fac 6
- java Assign1 -e 24
- java Assign1 -fib 6 -fac 6 -e 24
- java Assign1 -fib 6 -fib 10

## Example output from correct and incorrect command line arguments:

java Assign1 -fib 6 -fib 8 -fac 10 -fac 0 -e 10 -e 100

- Fibonacci of 6 is 8
- Fibonacci of 8 is 21
- Factorial of 10 is 3628800
- Factorial of 0 is 1
- Value of e using 10 iterations is 2.7182815255731922
- Value of e using 100 iterations is 2.7182818284590450
- java Assign1 -fib 6 -fib 50 -fac 0 -e 10 -e 0


- Fibonacci of 6 is 8
- Fibonacci valid range is [0, 40]
- Factorial of 0 is 1
- Value of e using 10 iterations is 2.7182815255731922
- Valid e iterations range is [1, 2147483647]
- java Assign1 -abc 123


- Unknown command line argument: -abc

Your program should be able to handle any number of requested computations.  Additionally, it should be able to handle 
the same computation request more than one time on a single command line; refer to the example command line usages above. 
Note that if multiple requested computations are made and one of them is not valid, complete all computations until the 
invalid input is given, then print the help instructions as given above and ignore the remaining requested computations.

## Additional Notes
Valid input ranges:
- Fibonacci input range is: 0 to 40
- Factorial input range is: 0 to largest Java Integer
- Iterations range for the 'e' [n] parameter is: 1 to largest Java Integer

For computing the Fibonacci, use the sequence beginning with 1;  F0 = 0, F1 = 1, F2 = 1, 2, 3, 5, ... [Note: if you use F0 = 1, that is ok]
Do not worry about rounding errors if the last required number is off compared to the example of e calculations

## Submission/Requirements
Place all of your code in a single .java file named Assign1.java.
Create an appropriately named zip file, according to the assignment submission instructions.
You should use BigInteger for the factorial computation.
You should use BigDecimal for the e computation.
Code must follow the course coding standard: 0.3: Coding Standards


### Java Tutorial (In case you need it)
TutorialsPoint: link (Links to an external site.) (This site usually does a good job)
Guru99: link (Links to an external site.) (It just looked good, I didn't go into detail)