package assingment_conditionals;

import java.util.Scanner;

public class largest_in_continous_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enterr the numbers and type 0 to stop");
        int num = in.nextInt();
        int value =0;
        int temp = num;
        while(num!=0){
            if(temp>=num){
                value = temp;
                temp = value;
            }
            else{
                value=num;
                temp = num;
            }
            System.out.println("Enter:");
            num = in.nextInt();
        }
        System.out.println(value);
    }
}
