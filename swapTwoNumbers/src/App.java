import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            int num1 = Integer.MAX_VALUE;
            int num2 = Integer.MAX_VALUE;
            System.out.println("Enter number a: ");
            num1 = scnr.nextInt();
            System.out.println("Enter number b: ");
            num2 = scnr.nextInt();
            System.out.printf("value of a and b before swapping, a: " + num1 + " b: " + num2);
            swapNumber(num1, num2);
        }
    }

    public static void swapNumber(int num1, int num2) {
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println(
                "\nvalue of a and b after swapping, a: " + num1 + " b: " + num2);
    }
}
