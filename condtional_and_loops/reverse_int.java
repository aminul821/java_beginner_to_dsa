package com.aminul.dsa;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to reverse its digits : ");
        int in = input.nextInt();
        while(in != 0){
            System.out.print(in%10);
            in = in/10;
        }
    }
}
