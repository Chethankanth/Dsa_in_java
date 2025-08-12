package Bitmanupulation;
import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        System.out.println("enter 1 if you want to convert the bit into 1 or select 0 if you want to convert it into 0");
        int nu  = sc.nextInt();
        if(nu == 1){
            int newNum = (n | bitmask);
            System.out.println("the new number after the setting it into 1 is: "+newNum);
        }
        else if (nu == 0) {
            int notNum = ~(bitmask);
            int newNum = (n & notNum);
            System.out.println("the new number after converting it into 0 is: "+newNum);
            
        }


    }
}