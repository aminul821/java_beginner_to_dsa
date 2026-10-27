package methods;

import java.util.Scanner;

public class prime_between_two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int num1 = in.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = in.nextInt();
        for (int i = num1; i<=num2 ; i++) {
             int check = is_prime(i);
             if(check == 1){
                 System.out.print(i + ",");
             }

        }
    }
    static int is_prime(int n){
        int check= 2;
        int verify;
        if(n<2){
            return 0;
        } else if (n == 2) {
            return 1;

        }
        while(check != n-1){
            if(n%check == 0){
                return 0;
            }
            check ++;
        }
        return 1;
    }

}
