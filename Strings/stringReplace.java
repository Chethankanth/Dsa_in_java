import java.util.*;
import java.util.Scanner;


public class stringReplace {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String result ="";

    for(int i = 0; i<str.length();i++){
        if(str.charAt(i)=='e'){
            result+='i';

        }
        else{
            result+=str.charAt(i);

        }
    }

    System.out.println("the final result is:");
    System.out.println(result);

        
    }
   
    
    
    
}
