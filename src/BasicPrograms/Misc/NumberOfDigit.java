package BasicPrograms.Misc;

public class NumberOfDigit {
    public static int numberOfDigit(int num) {
        int digit = 0;
        while (num > 0) {
            num = num / 10;
            digit++;
        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDigit(1234));
    }
}
