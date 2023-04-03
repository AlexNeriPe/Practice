import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            String word;
            System.out.println("Enter a word to validate: ");
            word = scnr.nextLine();
            System.out.printf("Input : %s  Output: %s %n",
                    word, removeDuplicatesFromString(word));
        }
    }

    private static Object removeDuplicatesFromString(String word) {
        if (word == null || word.length() < 2) {
            return word;
        }

        char[] characters = word.toCharArray();
        for (int i = 1; i < word.length(); i++) {
            int j;
            for(j = 0 ; j < i ; ++j) {
                if(characters[i] == characters[j]) {
                    break;
                }
            }
            if(i != j) {
                characters[j] = 0;
            }
        }

        StringBuilder sb = new StringBuilder(characters.length);
        for(Character ch : characters) {
            if(ch != 0) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}