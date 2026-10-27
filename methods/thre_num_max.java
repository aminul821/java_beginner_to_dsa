package methods;

import java.util.Arrays;
import java.util.Scanner;

public class thre_num_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter  teh second number : ");
        int num2 = in.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = in.nextInt();
        int maximum = max(num1,num2,num3);
        System.out.println(maximum);
    }
    static int max(int a , int b , int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a&&b>c){
            return b;
        }
        else {
            return c;
        }
    }

}
