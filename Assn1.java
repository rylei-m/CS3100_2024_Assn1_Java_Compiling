
public class Assn1 {
    // TODO: Implement Fibonacci
    public static int fibonacci(int n) {
        int n1 = 0, n2 = 1, n3;
        for (int i = 2; i <= n; i++) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
    }
    return n2;
    }
    
    // TODO: Implement Factorial with BigNumber

    //TODO: Compute Val of E with Taylor Series

    //TODO: Print Help Instructions (Just Sys.Outs)

    //TODO: Create Main using the Above
    
}
