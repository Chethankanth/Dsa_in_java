

import java.util.*;


public class SortedIncr {

    public static boolean checkSort(int [] arr, int idx){
        if(idx == arr.length - 1){
            System.out.println("the given array is sorted");
            return true;
        }

        if(arr[idx]>=arr[idx+1]){
            System.out.println("the given array is not sorted");
            return false;
        }
        checkSort(arr, idx+1);
        // The above line will check the next element in the array
        // If the current element is less than or equal to the next element,
        // it will continue checking the rest of the array.
        // If it finds any element that is greater than the next element,
        // it will return false and print that the array is not sorted.
        // If it reaches the end of the array without finding any such element,
        // it will return true and print that the array is sorted.
        return true; // This will be reached only if all elements are in sorted order
        
    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,7,8};
        boolean isSorted = checkSort(arr,0);
    }
    
}
