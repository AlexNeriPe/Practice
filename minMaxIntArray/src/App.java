import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            int number = Integer.MAX_VALUE;
            List<Integer> list = new ArrayList<Integer>();
            while (number != 0) {
                System.out.println("Enter numbers(0 to exit) ");
                number = scnr.nextInt();
                list.add(number);
            }
            // toArray returns Object[], we need to pass the size of our Integer[] array
            Integer[] numbers = list.toArray(new Integer[list.size()]);
            largestAndSmallest(numbers);
        }
    }
    
    public static void largestAndSmallest(Integer[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int n : numbers) {
            if(n > largest) {
                largest = n;
            } else if(n < smallest) {
                smallest = n;
            }
        }
        System.out.printf("Given the array {%s}", Arrays.toString(numbers));
        System.out.printf("\nThe smallest number is [%s]", smallest);
        System.out.printf("\nThe largest number is [%s]", largest);   
    }
}
