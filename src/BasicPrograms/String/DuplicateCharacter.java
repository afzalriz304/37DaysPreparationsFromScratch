package BasicPrograms.String;

import Utils.StringUtils;

public class DuplicateCharacter {

    public static void duplicateCharacters(String str) {
        if (StringUtils.isNotEmpty(str)) {
            int[] occurrence = findOccurrence(str.toLowerCase().toCharArray());
            printDuplicate(occurrence);
        } else
            System.out.printf("Empty string");
    }

    public static int[] findOccurrence(char[] charArr) {
        int[] list = new int[26];
        if (charArr.length > 0) {
            for (char c : charArr) {
                int index = (int) c - 97;
                list[index]++;
            }
        }
        return list;
    }

    public static void printDuplicate(int[] occurrence) {
        if (occurrence.length > 0) {
            for (int i = 0; i < occurrence.length; i++) {
                if (occurrence[i] > 1) {
                    System.out.println("character -> " + Character.toString((char) (i + 97)) + " times " + occurrence[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        duplicateCharacters("Afzazll");
    }
}
