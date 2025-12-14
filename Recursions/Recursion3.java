public class Recursion3 {


   public static int pairFriends(int n) {
      if(n <= 1) {
          return 1;
      }


       return pairFriends(n-1) + (n-1) * pairFriends(n-2);
   }


   public static void main(String args[]) {
       int n = 12;
       System.out.println(pairFriends(n));
   }
}

/////
/// import java.util.ArrayList;


