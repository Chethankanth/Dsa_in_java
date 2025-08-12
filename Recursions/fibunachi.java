import java.util.*;


public class fibunachi{

    public static void fibumachi(int a,int b,int n) {
        if(n==0){
            return ;
        }
        
        int c = a+b;
        System.out.println("fibunachi series: "+c);
        fibumachi(b,c,n-1);
        return ;
}
    public static void main(String [] args){
        int n=7;
        int a = 0;
        int b = 1;
        int fact ;
        System.out.println(a);
        System.out.println(b);
        fibumachi(a,b,n-2);
    }

}