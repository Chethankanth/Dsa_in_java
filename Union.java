import java.util.*;
public  class Union {
   

    public static int uniqueArr(int arr1[],int arr2[]){
         HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<arr1.length-1;i++){
            hs.add(arr1[i]);
        }

        for(int i= 0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }

        return hs.size();
    }

    public static void main(String[]args){
        int arr1[]={1,2,6,9,3,0};
        int arr2[]={1,2,5,2,7,9,0,7,4};

        int UniquSize = uniqueArr(arr1, arr2);
        System.out.println("the size of the unique array is: "+UniquSize);


    }
    
}
