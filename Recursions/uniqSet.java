
    import java.util.*;


    public class uniqSet {

    public static void subsq(String str, String newStr, int index,HashSet<String> set){
        if(index==str.length()){
           if(set.contains(newStr)) {
               return; // Skip if the subsequence is already present
           } else {
               set.add(newStr);
               System.out.println("The unique subsequence is: " + newStr);
               return; // Return after printing to avoid further processing

           }
        }

        char currChar = str.charAt(index);
        
        // Include the current character    
        subsq(str, newStr+currChar, index+1,set);


        // Exclude the current character
        subsq(str, newStr, index+1,set);
        return;
    }

    public static void main(String[] args) {
        String str = "abc";
        String newStr = "";

        HashSet<String> set = new HashSet<>();
        subsq(str,newStr,0,set);
    }
    
}



