import java.util.*;
public class re1{

    public static int printnums(int n){
        if(n==0){
            return 0;
        }
        printnums(--n);
        System.out.println(n);
        return 0;
    }

    public static void main(String [] args){
        int n = 5;

        int nums = printnums(n);
    }

}