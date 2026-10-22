package com.aminul.dsa;
import java.util.*;

public class Subtract_sum_product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur integer : ");
        int in = input.nextInt();
        int in2 = in;
        int value1 = 1;
        while(in != 0){
            int temp = in%10;
            in = in/10;
            value1 = value1 *temp ;
        }
       
        int value2 = 0;
        while(in2 != 0){
            int temp = in2%10;
            in2 = in2/10;
            value2=value2+  temp ;
        }

        System.out.println(value1- value2);
    }
}
