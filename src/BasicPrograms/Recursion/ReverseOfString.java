package BasicPrograms.Recursion;

/**
 * Created by hasher on 29/6/20.
 */
public class ReverseOfString {
    public static String reverse(String str){
        if(str.length()==0){
            return " ";
        }
        int last_index=str.length()-1;
        return str.charAt(last_index) + reverse(str.substring(0,last_index));
    }

    public static void main(String[] args) {
        System.out.println(reverse("Afzal"));
    }
}
