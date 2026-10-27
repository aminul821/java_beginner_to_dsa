package assingment_conditionals;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int save = n;
        int count = 0;
        int result = 1;
        int temp = n;
        int tresult=0;
        while(n!=0){

            n=n/10;
            count ++;

        }
        while(temp!=0){
            int base = temp%10;
            temp = temp/10;
            for(int i = 0;i<count;i++) {
                result = result * base;
            }
            tresult = tresult+result;
            result = 1;

        }
      if(save== tresult){
          System.out.println("this is an armstrong number");
      }
      else{
          System.out.println("its not an armstrong number");
        }

    }
}
