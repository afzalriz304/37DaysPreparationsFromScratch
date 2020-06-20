package BasicPrograms.String;

import Utils.StringUtils;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str.isEmpty()) {
            return true;
        } else if (StringUtils.isNotEmpty(str)) {
            if (str.equalsIgnoreCase(Reverse.reverse(str))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.printf("Palindrome " + isPalindrome("Nitin"));
    }
}
