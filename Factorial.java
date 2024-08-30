/*
Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted
by n!. For example:

4! = 4*3*2*1 = 24
5! = 5*4*3*2*1 = 120
 */

public class Factorial {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return(n*factorial(n-1));
        }
    }
}
