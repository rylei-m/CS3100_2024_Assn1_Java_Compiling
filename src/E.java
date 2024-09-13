public class BigDecimal {
    public static BigDecimal valE(int iterations) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1; i <= iterations; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
            e = e.add(BigDecimal.ONE.divide(factorial, 25, RoundingMode.HALF_UP));
        }
        return e;
    }
}

public class BigInteger {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
