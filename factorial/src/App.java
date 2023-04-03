import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            int number = Integer.MAX_VALUE;
            System.out.println("Enter number to find factorial ");
            number = scnr.nextInt();
            System.out.printf("%d! = %d", number, factorial(number));
        }
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}
