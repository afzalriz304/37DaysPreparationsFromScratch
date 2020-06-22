package BasicPrograms.Misc;

public class ReverseNumber {

    public static int reverse(int n) {
        int digit = NumberOfDigit.numberOfDigit(n);
        double num = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            num = num + r * Math.pow(10, digit - 1);
            digit--;
        }
        return (int) num;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
