import java.util.*;


public class factorial{

    public static int printnums(int n,int fact) {
    if (n == 0 ||n == 1) {
        System.out.println("factorial is: "+fact);
        return fact;
    }
    
  
    fact*=n;
    printnums(n-1,fact);
    System.out.println(n);
    return 0;
   
}
    public static void main(String [] args){
        int n;
        int fact ;

        int nums = printnums(5,1);
    }

}