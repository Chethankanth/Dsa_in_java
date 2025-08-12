import java.util.*;


public class fitstLastoccurance {

    static int firstIndex = -1;
    static int lastIndex = -1;
    public static void firstlast(String str,String ele, int index){
        if(index == str.length()){
            System.out.println("the first index of the element is: "+firstIndex+" and the last index is: "+lastIndex);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == str.charAt(index)){
            if(firstIndex == -1){
                firstIndex = index;
            }
            else{
                lastIndex = index;
            }
        }
        
        firstlast(str, ele, index + 1);

        


        return ;
    }


    public static void main(String[] args) {
        String str = "abaa";
        String ele = "a";

        firstlast(str,ele,0);


    }
    
}
