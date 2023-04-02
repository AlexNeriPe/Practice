import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            String word;
            System.out.println("Enter a word to reverse: ");
            word = scnr.nextLine();
            System.out.printf("Word reversed [%s]", reverse(word));
            System.out.printf("\nWord reversed(StringBuilder) [%s]", reverseSB(word));
        }
    }

    public static String reverse(String word) {
        if(word == null) {
            return word;
        }
        String reverse = "";
        // Start from the end
        for(int i = word.length() - 1; i >= 0 ; i--) {
            // charAt returns the char at the index provided
            reverse = reverse + word.charAt(i); 
        }
        return reverse;
    }

    public static String reverseSB(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}
