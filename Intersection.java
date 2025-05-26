import java.util.*;
public class Intersection {

    public static int intersectionArr(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count= 0;

        for(int i =0;i<arr1.length-1;i++){
           set.add(arr1[i]);
        }
        for(int j =0;j<arr2.length-1;j++){
            if(set.contains(arr2[j])){
                count++;
                System.out.println(arr2[j]);
                set.remove(arr2[j]);
                
            }
        }
        return count;
        }

         public static void main(String [] args){

        int arr1[] = {1,2,5,7,3,9,0,10};
        int arr2[] = {1,4,2,7,9,14,55};

        System.out.println(intersectionArr(arr1, arr2));
        

    }
    
        

    }

   

