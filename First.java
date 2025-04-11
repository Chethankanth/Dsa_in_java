import java.util.*;
import java.util.Scanner;

public class First {

    public void twoSums(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            int sum = arr[i]+arr[i-1];
            System.out.println("the sum of the two number num: "+arr[i]+"num: "+arr[i-1]+"is: "+sum);
        }    
    }
    public void searchIndex(int arr[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number you want to search in the array: ");
        int num = sc.nextInt();
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("the index at which the number "+num+"is present is"+i);

            }
        }

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println(("enter the size of the array: "));
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements; ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        First obj = new First();
        obj.twoSums(arr);
        
    }
}
