import java.util.*;
public class DiagonalArraySum {

    public void rightDiaSum(int arr[][],int n){
        int sum = 0;
        for(int i = 0;i<n;i++){
            for(int j= 0;j<n;j++){
                if(i == j){
                    sum += arr[i][j];
                }

            }
            }
        
       System.out.println("Left diagonal sum: " + sum);
    }
public void leftDiaSum(int arr[][],int n){
    int i;
    int Sum = 0;
    for(i=0;i<n;i++){ 
        for(int j = 0;j<n;j++){
             if(i+j==n){
        Sum+=arr[i][i];
    }
        }
       }
   
    System.out.println("the right sum is: "+Sum);
}

// public void left(int arr[],int n){
//     int i;
//     int Sum =0;
//     for(i=0;i<n;i++){
//              Sum+=arr[i][i];
//     }
// }
    public static void main(String[] args) {
        DiagonalArraySum dr = new DiagonalArraySum();
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;
        dr.leftDiaSum(arr, n);
    }
}

    
    

