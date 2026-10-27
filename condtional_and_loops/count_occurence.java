package condtional_and_loops;
import java.util.*;
public class count_occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number where u want to find the occurence : ");
        int no = input.nextInt();
        System.out.println("Enter the number whose occurence need to be found");
        int test = input.nextInt();
        int count=0 ;
        int stop = 1;
        while(stop != 0){
            int temp = no % 10;
            if(temp == test ){
                count +=1;
            }
            no = no/10;
            if(no == 0){
                stop = 0;
            }

        }
        System.out.println(count);

    }
}
