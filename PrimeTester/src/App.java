import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scnr = new Scanner(System.in)) {
            int number = Integer.MAX_VALUE;
            System.out.println("Enter number to check if prime or not ");
            while (number != 0) {
                number = scnr.nextInt();
                System.out.printf("Does %d is prime? %s %n", number, isPrime(number));
            }
        }
    }

    public static boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n) + 1;
        for(int i = 2; i < sqrt; i++) {
            if(n % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

    //Find the square root of the number because is the last number to be
    //divisible and we add one to verify all the cases 
    //returns a float value, we need to parse it 

}
