package methods;

import java.util.Scanner;

public class factorial_without_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to know its factorial : ");
        int num = in.nextInt();
        int ans = factorial(num);
        System.out.println(ans);

    }
    static int factorial(int n ){
        int result = 1;
        if(n == 0|| n == 1 ){
            return 1;
        }
        else{
            for(int i =n ; i>0;i--){
                result = result*i;

            }
            return result;
        }
    }
}
