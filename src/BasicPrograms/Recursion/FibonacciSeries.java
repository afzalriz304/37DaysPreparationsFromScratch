package BasicPrograms.Recursion;

/**
 * Created by hasher on 29/6/20.
 */
public class FibonacciSeries {

    public static String Fibonacci(int a, int b, int n) {
        if (n == 0) {
            return String.valueOf(a);
        }
        return a + "," + Fibonacci(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(0, 1, 6));
    }
}
