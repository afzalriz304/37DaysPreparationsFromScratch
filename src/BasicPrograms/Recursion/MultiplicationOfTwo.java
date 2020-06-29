package BasicPrograms.Recursion;

/**
 * Created by hasher on 29/6/20.
 */
public class MultiplicationOfTwo {

    public static void multiplcation(int a, int b) {
        int product;
        if (a > b) {
            product = prod(a, b);
        } else {
            product = prod(b, a);
        }
        System.out.printf("product " + product);
    }

    public static int prod(int max, int min) {
        if (min == 0) {
            return 0;
        }
        return max + prod(max, min-1);
    }

    public static void main(String[] args) {
        multiplcation(4, 6);
    }
}
