import java.util.*;
public class xpowlogn {

    public static int xpowlogn(int x, int p) {
        if(x == 0) {
            return 0; // x^p is 0 if x is 0
        }
        if (p == 0) {
            return 1; // Base case: x^0 = 1
        }
        if (p % 2 == 0) {
            int halfPower = xpowlogn(x, p / 2);
            return halfPower * halfPower; // Even power
        } else {
            return x * xpowlogn(x, p - 1); // Odd power
        }
    }

    public static void main(String[] args){
        int x = 2;
        int p = 5;

        int powprint = xpowlogn(x,p);
        System.out.println(powprint);
    }
    
}
