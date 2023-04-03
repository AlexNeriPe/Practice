import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            int number = Integer.MAX_VALUE;
            System.out.println("Enter number to reverse ");
            while (number != 0) {
                number = scnr.nextInt();
                System.out.printf("number reversed: [%s]", reverse(number));
            }
        }
    }

    public static int reverse(int n) {
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        } while(n > 0);
        return reverse;
    }
}
