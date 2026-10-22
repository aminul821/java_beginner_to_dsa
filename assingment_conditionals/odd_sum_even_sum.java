
import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter numbers (0 to stop):");

        int n = input.nextInt();

        while (n != 0) {
            if (n < 0) {
                negativeSum += n;
            } else if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }

            n = input.nextInt();
        }

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + evenSum);
        System.out.println("Sum of positive odd numbers: " + oddSum);

        input.close();
    }
}
