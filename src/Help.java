public static void printHelp() {
    System.out.println("--- Assign 1 Help ---");
    System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
    System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
    System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
}
}
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