import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            String word;
            System.out.println("Enter a word to find chars duplicated: ");
            word = scnr.nextLine();
            printDuplicateChar(word);
        }
    }

    public static void printDuplicateChar(String word) {
        char[] characters = word.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char ch : characters) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // map.entrySet() returns [key1=val1, key2=val2, key3=val3] unique values
        // var entries = map.entrySet().stream().map(Map.Entry::copyOf).toList()
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);

        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
