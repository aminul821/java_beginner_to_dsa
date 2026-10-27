package condtional_and_loops;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("choose the amount of fibonnaci series u want (more than 2): ");
        int n = input.nextInt();
        int p = 0;
        int next = 1;

        System.out.println(p);
        System.out.println(next);
        for(int i = 0 ; i<n-2;i++){
            int temp = next;
            next = p+next;
            p = temp;
            System.out.println(next);
        }
    }
}
