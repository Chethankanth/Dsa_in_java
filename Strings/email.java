import java.util.*;

public class email {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the email id");

        String email = sc.nextLine();
        String resule = "";

        for(int i = 0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                resule+=email.charAt(i);

            }
        }
        System.out.println("the username is: " + resule);

        


    }
    
}
