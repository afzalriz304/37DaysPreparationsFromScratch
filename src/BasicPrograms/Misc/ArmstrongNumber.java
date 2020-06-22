package BasicPrograms.Misc;

public class ArmstrongNumber {

    public static boolean checkArmstrongNumber(int num) {
        int temp = num;
        int digit = NumberOfDigit.numberOfDigit(num);
        double n = 0;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            n = n + Math.pow(r, digit);
        }
        if ((int) n == temp) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkArmstrongNumber(153));
    }
}
