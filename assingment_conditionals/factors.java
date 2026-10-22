package com.aminul.dsa;
import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enetr the number to find factors:");
        int num = in.nextInt();
        System.out.print("Factors are :");
        for(int i = 1 ; i <= num/2; i++){
            if(num%i == 0){
                System.out.print( i + ",");
            }

        }
        System.out.print(num);

    }
}
