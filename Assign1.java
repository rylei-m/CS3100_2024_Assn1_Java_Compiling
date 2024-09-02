import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
public class Assign1 {
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

    public static void printHelp() {
        System.out.println("--- Assign 1 Help ---");
        System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
        System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
        System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
    }
}