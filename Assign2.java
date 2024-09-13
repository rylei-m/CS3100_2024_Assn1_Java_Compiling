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
}