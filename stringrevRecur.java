import java.util.*;

public class stringrevRecur {
    
    public static void stringRev(String str,int index){

        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }

        System.out.println(str.charAt(index));

        stringRev(str,index-1);

    }

    public static void main(String[] args) {
        String str = "PCAS";
        int index = str.length()-1;

        stringrevRecur obj = new stringrevRecur();
        obj.stringRev(str, index);
    }

}
