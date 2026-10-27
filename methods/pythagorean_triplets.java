package com.aminul.dsa;

import java.util.Scanner;

public class pythagorean_triplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter th 1st number : ");
        int num1 = in.nextInt();
        System.out.println("Enter th 2nd number : ");
        int num2 = in.nextInt();
        System.out.println("Enter th 3rd number : ");
        int num3 = in.nextInt();

        pythagoran_trip(num1,num2,num3);
    }
    static int power(int base , int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result*base;

        }
        return result;
    }
    static void pythagoran_trip(int a , int b, int c){
        int max = 0;
        if(a>b &&  a>c){
            max = a;
            int check = power(b,2) + power(c,2);
            if(power(a,2)==check){
                System.out.println("Is a pythagorean triplet");

            }
        } else if (b>a&&b>c) {
            max = b;
            int check = power(a,2) + power(c,2);
            if(power(b,2)==check){
                System.out.println("Is a pythagorean triplet");

            }
        }
        else {
            max = c;
            int check = power(a,2) + power(b,2);
            if(power(c,2)==check){
                System.out.println("Is a pythagorean triplet");

            }
        }

    }
}
