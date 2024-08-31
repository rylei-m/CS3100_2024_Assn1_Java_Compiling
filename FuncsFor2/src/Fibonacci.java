public class Fibonacci {
    static int n1 = 0, n2 = 1,n3 = 0;
    static void Fib(int count) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.println(" " + n3);
        Fib(count - 1);
    }
}
