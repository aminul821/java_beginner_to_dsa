package assingment_conditionals;
import java.util.*;
public class sum_until_stop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enterr the numbers and type 0 to stop");
        int num = in.nextInt();
        int value =0;
        while(num!=0){
           int temp = num;
           value = value+temp;
            System.out.println("Enter:");
           num = in.nextInt();

        }
        System.out.println(value);

    }
}
