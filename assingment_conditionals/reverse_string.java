package assingment_conditionals;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String sc = in.next();
        int n = sc.length();
        for(int i = n-1;i>0;i--){
            System.out.print(sc.charAt(i));
        }
    }
}
