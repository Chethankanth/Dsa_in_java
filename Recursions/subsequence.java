import java.util.*;

public class subsequence {


    public static void subsq(String str, String newStr, int index){
        if(index==str.length()){
            System.out.println("the subsequence is: "+ newStr);
            return;
        }

        char currChar = str.charAt(index);
        
        // Include the current character    
        subsq(str, newStr+currChar, index+1);


        // Exclude the current character
        subsq(str, newStr, index+1);
        return;
    }

    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";
        subsq(str,newStr,0);
    }
    
}
