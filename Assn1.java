import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
public class Assn1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            printHelp();
            return;
        }

        try {
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "-fib":
                        int fibNum = Integer.parseInt(args[++i]);
                        if (fibNum < 0 || fibNum > 40) {
                            System.out.println("Fibonacci valid range is [0, 40]");
                        } else {
                            System.out.println("Fibonacci of " + fibNum + " is " + fibonacci(fibNum));
                        }
                        break;

                    case "-fac":
                        int facNum = Integer.parseInt(args[++i]);
                        if (facNum < 0) {
                            System.out.println("Factorial valid range is [0, 2147483647]");
                        } else {
                            System.out.println("Factorial of " + facNum + " is " + factorial(facNum));
                        }
                        break;

                    case "-e":
                        int eIterations = Integer.parseInt(args[++i]);
                        if (eIterations < 1) {
                            System.out.println("Valid e iterations range is [1, 2147483647]");
                        } else {
                            System.out.println("Value of e using " + eIterations + " iterations is " + valE(eIterations));
                        }
                        break;

                    default:
                        System.out.println("Unknown command line argument: " + args[i]);
                        printHelp();
                        return;
                }
            }
        } catch (Exception e) {
            printHelp();
        }
    }


    public static int fibonacci(int n) {
        int n1 = 0, n2 = 1, n3;
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigDecimal valE(int iterations) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1; i <= iterations; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
            e = e.add(BigDecimal.ONE.divide(factorial, 25, RoundingMode.HALF_UP));
        }
        return e;
    }

    public static void printHelp() {
        System.out.println("--- Assign 1 Help ---");
        System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
        System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
        System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
    }
}