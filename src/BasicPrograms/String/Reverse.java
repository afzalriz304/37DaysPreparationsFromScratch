package BasicPrograms.String;

import Utils.StringUtils;

public class Reverse {

    public static String reverse(String str) {
        String reverse = "";
        if (StringUtils.isNotEmpty(str)) {
            char[] charArr = str.toCharArray();
            for (int i = charArr.length - 1; i >= 0; i--) {
                reverse = reverse + charArr[i];
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.printf("Reverse " + reverse("ABC"));
    }
}
