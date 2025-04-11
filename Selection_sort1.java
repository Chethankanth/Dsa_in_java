import java.util.*;
import java.util.Scanner;

public class Selection_sort1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i;
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

            for( i = 0;i< n-1;i++){//logic for selection sort
                int min = i;
                for(int j = i+1;j<n;j++){

                    if(arr[j]<arr[min]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                
            }
        }
        else if(choice ==2){//logic for bubble sort

            for(i = n-1;i>=0;i--){
                for(int j = 0;j<i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    
                }
            }
        }

        else if(choice == 3){//logic for insertion sort

            for ( i = 1; i < arr.length; i++) {  
                int j = i;  
                while (j > 0 && arr[j - 1] > arr[j]) {  // Ensure j > 0 to avoid arr[-1] access  
                    int temp = arr[j - 1];  
                    arr[j - 1] = arr[j];  
                    arr[j] = temp;  
                    j--;  
                }  
            }
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
