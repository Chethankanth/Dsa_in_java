import java.util.*;
import java.util.Scanner;

public class Arr {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println(("enter the row size of the array: "));
        int n = sc.nextInt();
        System.out.println(("enter the column size of the array: "));
        int m = sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter the 2d array elements; ");
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
            arr[i][j] = sc.nextInt();
            
        }
        }
        Arr obj = new Arr();
        
        obj.twoDarr(arr,n,m);
        obj.searchIndex(arr,n,m);
    }

   
    public void searchIndex(int arr[][],int n,int m){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number you want to search in the array: ");
        int num = sc.nextInt();
        for(int i=0 ; i<n;i++){
            for(int j =0;j<m;j++){
            if(arr[i][j]==num){
                System.out.println("the index at which the number "+num+"is present in the row"+i+"and the colum"+j);

            }
            
        }

    }
    }
     public void twoDarr(int arr[][],int n,int m){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
        }
         System.out.println();
    }
    }

    
}

