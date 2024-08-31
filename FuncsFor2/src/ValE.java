public class ValE  {
    public static double CalcE(int n) {
        double e = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            e += 1.0 / factorial;
        }
        return e;
    }
}
