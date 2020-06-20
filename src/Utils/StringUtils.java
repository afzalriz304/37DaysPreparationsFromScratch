package Utils;

public class StringUtils {

    public static boolean isEmpty(String str) {
        if (str.length() > 0 && str != null) {
            return false;
        }
        return true;
    }

    public static boolean isNotEmpty(String str) {
        if (str.length() > 0 && str != null) {
            return true;
        }
        return false;
    }
}
