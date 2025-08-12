// package bank;
import java.util.*;
class Account{
   public String name;//can accssed by same package and also by other package any classes;
   protected String email;//can only accessed by current package and subclasses of other packages
   private String password;//can only accessed by same class;
    String phone;//default access modifier can only be accessed by same package classes;

    public String getPassword()
{
    return this.password;
}
    public void setPassword(String pass){
        this.password = pass;
    }
}



public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "John Doe"; // Accessible due to public access modifier
        account1.email = "1ms23cs401@msrit.edu"; // Accessible due to protected access modifier within the same package
        account1.phone = "1234567890"; // Accessible due to default access modifier within the same package
        account1.setPassword("securePassword"); // Accessible through public setter method
        //here we use the function name of the class as the object name
        System.out.println(account1.getPassword()); // Accessible through public getter method
    }

    
    
}
