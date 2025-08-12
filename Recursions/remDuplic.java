import java.util.*;


public class remDuplic {

    public static boolean [] map = new boolean[26];

    public static void removedup(String str,int index,String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']==true){
            removedup(str, index+1, newstr);
        }
        else{
            map[currChar - 'a']= true;
            newstr += currChar;
            removedup(str, index+1, newstr);
        }
    }

    public static void main(String[] args){
        String str = "aababafnolanfargiowhighaoshnfjdnuhuhhhosheufhweiohuhuhh";
        String newstr="";
        removedup(str,0,newstr);
    }
    
}
