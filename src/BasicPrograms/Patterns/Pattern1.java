package BasicPrograms.Patterns;

/**
 *    *
 *   ***
 *  *****
 * *******
 */
public class Pattern1 {
    public static void main(String[] args) {
        int n = 4, i, j, k, l;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < n - j; k++) {
                System.out.print("*");
            }
            for (l = 0; l < k - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
