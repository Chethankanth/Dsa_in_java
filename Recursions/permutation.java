import java.util.*;

public class permutation {

    public static void permuting(String str, String permute){
        if(str.length() == 0){
            System.out.println("The unique permutation is: " + permute);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1,str.length());
            permuting(newStr, permute + currChar);  // FIXED: use newStr here
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        String permut = "";
        permuting(str, permut);
    }
}