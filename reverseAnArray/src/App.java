import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            int number = Integer.MAX_VALUE;
            while (number != 1 && number != 2) {
                System.out.println("1. For Integer Array \n2. 1For reverse String Array");
                number = scnr.nextInt();
                scnr.nextLine();
            }
            if (number == 1) {
                number = Integer.MAX_VALUE;
                List<Integer> list = new ArrayList<Integer>();
                while (number != 0) {
                    System.out.println("Enter numbers(0 to exit)");
                    number = scnr.nextInt();
                    scnr.nextLine();
                    if (number != 0) {
                        list.add(number);
                    }
                }
                Integer[] arrayNums = list.toArray(new Integer[list.size()]);
                System.out.println("Original array: " + Arrays.toString(arrayNums));
                System.out.println("Reverse array: " + Arrays.toString(reverseIntArray(arrayNums)));
            } else {
                List<String> list = new ArrayList<>();
                String input = "";
                while (!"end".equalsIgnoreCase(input)) {
                    System.out.println("Enter a list of strings (one per line, enter 'end' to finish):");
                    input = scnr.nextLine();
                    if (!"end".equalsIgnoreCase(input) && input != "") {
                        list.add(input);
                    } else if (input.isEmpty() || "end".equalsIgnoreCase(input)) {
                        break;
                    }
                }
                String[] arrayWords = list.toArray(new String[list.size()]);
                System.out.println("Original array: " + Arrays.toString(arrayWords));
                System.out.println("Reverse array: " + Arrays.toString(reverseStringArray(arrayWords)));
            }
        }
    }

    public static Integer[] reverseIntArray(Integer[] arrayNums) {
        int leftIndex = 0;
        int rightIndex = arrayNums.length - 1;

        while (leftIndex < rightIndex) {
            int temp = arrayNums[leftIndex];
            arrayNums[leftIndex] = arrayNums[rightIndex];
            arrayNums[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return arrayNums;
    }

    public static String[] reverseStringArray(String[] arrayString) {
        int leftIndex = 0;
        int rightIndex = arrayString.length - 1;

        while (leftIndex < rightIndex) {
            String tmp = arrayString[leftIndex];
            arrayString[leftIndex] = arrayString[rightIndex];
            arrayString[rightIndex] = tmp;
            leftIndex++;
            rightIndex--;
        }
        return arrayString;
    }
}
