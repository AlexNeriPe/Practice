import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            String word1;
            String word2;
            System.out.println("Enter a word to validate: ");
            word1 = scnr.nextLine();
            System.out.println("Enter a word to validate: ");
            word2 = scnr.nextLine();
            System.out.printf("Is [%s] anagram of [%s]: %s", word1, word2, anagram(word1, word2));
        }
    }

    public static boolean anagram(String word1, String word2) {
        if (!word1.isEmpty() && !word2.isEmpty()) {
            char[] arrayW1 = word1.toCharArray();
            char[] arrayW2 = word2.toCharArray();

            Arrays.sort(arrayW1);
            Arrays.sort(arrayW2);
            return Arrays.equals(arrayW1, arrayW2);
        } else {
            return false;
        }
    }
}
