package BasicPrograms.String;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        String nonDuplicate = "";
        char[] charArr = str.toLowerCase().toCharArray();
        int[] occurrence = DuplicateCharacter.findOccurrence(charArr);
        for (char c : charArr) {
            int i = (int) c;
            if (occurrence[i - 97] > 1) {
                continue;
            }
            nonDuplicate = nonDuplicate + c;
        }
        return nonDuplicate;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("Afzal"));
    }
}
