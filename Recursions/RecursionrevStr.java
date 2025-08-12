
import java.util.*;


public class RecursionrevStr {

    public static void revstr(String str,int idx){

        if(idx ==0){
            System.out.println(str.charAt(idx));
            return ;
        }

        System.out.println(str.charAt(idx));
        revstr(str,idx-1);
        // The above line will print the characters in reverse order
        // because we are printing the character after the recursive call.
        // If we print before the recursive call, it will print in original order.      


    }
    
    public static void main(String[]args){
        String str = "abcd";
        int idx = str.length()-1;

        revstr(str,idx);
    }
}
