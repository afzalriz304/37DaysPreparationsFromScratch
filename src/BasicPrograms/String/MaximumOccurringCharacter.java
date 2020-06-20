package BasicPrograms.String;

public class MaximumOccurringCharacter {

    public static void maximumOccurring(String str) {
        int[] occurrence = DuplicateCharacter.findOccurrence(str.toLowerCase().toCharArray());
        int max = 0;
        String c = "";
        for (int i = 0; i < occurrence.length; i++) {
            if (occurrence[i] > max) {
                c = Character.toString((char) (i + 97));
                max = occurrence[i];
            }
        }
        System.out.println("Maximum Occurring " + c);
    }

    public static void main(String[] args) {
        maximumOccurring("Afzazlz");
    }
}
