import java.util.*;
public class moveXtoend {
    

    public static void moveXtolast(StringBuilder str, int index,int count,String finalStr){
       
        if(index == str.length()){

            for(int i = 0;i<count;i++){
                finalStr+='x';
            }
            System.out.println(finalStr);

            return;

        }

        char currChar = str.charAt(index);
        
        if(currChar !='x'){
            finalStr+= currChar;       
         }
         else {
            count++;
         }

        moveXtolast(str,index+1,count,finalStr);
        return;
    }
    public static void main(String[] args){
        String str = "axbxxcxdfagxxtete";
        StringBuilder sb = new StringBuilder(str);
         String finalStr = "";
        moveXtolast(sb,0,0,finalStr);
}
}
