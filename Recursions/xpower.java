import java.util.*;

public class xpower {

    public static int calcpower(int a, int b){
        if(a==0){
            return 0;
        }
        if(b == 0){
            return 1;
        }

        int power = calcpower(a,b-1);
        int xpow = a*power;
        return xpow;

    }

    public static void main(String[] args){
        int x = 2;
        int n =5;

        int powval = calcpower(x,n);
        System.out.println(powval);
    }
    
}
