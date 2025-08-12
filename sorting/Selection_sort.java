package sorting;
import java.util.*;
import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i;
        int j;
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array of elements into the array: ");
        for(i =0 ;i<n;i++){

            arr[i]=sc.nextInt();


        }

        System.out.println("enter 1 for selection sort, 2 for bubble sort, sselect 3 for insertion sort!..: ");
        int choice = sc.nextInt();
        if(choice == 1){
          //logic for selection sort
          for(i= 0;i<arr.length-1;i++){
            int min = i;
            for(j = i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                }
            }
          }
               
        }
        else if(choice ==2){//logic for bubble sort
            for(i =arr.length-1;i>=0;i--){
                for( j = 0;j<i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[i];
                        arr[i]= arr[j];
                        arr[j] = temp;

                    }


                }

            }

            
        }

        else if(choice == 3){
//logic for insertion sort
            for(i = 1;i<arr.length;i++){
                j = i;
                while(j>0 && arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
            /////
             
            
        }
        else{
            System.out.println("invalid choice!..");
        }
        
        System.out.println("the sorted array is: ");
        for(i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
        
    


    }
}
