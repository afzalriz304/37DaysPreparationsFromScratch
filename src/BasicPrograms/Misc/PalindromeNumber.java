package BasicPrograms.Misc;

public class PalindromeNumber {

    public static boolean checkPalindrome(int num){
        int rev = ReverseNumber.reverse(num);
        if(rev==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }
}
