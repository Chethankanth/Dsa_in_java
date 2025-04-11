import java.util.*;


public class MergSort {
public static void conquer(int arr[],int s, int mid,int end){
    int merged[] = new int[end-s+1];//this is the new array which is merged and sorted
    int idx1 = s;//this is because to take elememts from the first part 
    int idx2=mid+1;//this is because t0 take elements from the second part 
    int x = 0;
    while(idx1<= mid && idx2<=end){//this statement checks and only works when elements present in both the array else it wont work
        if(arr[idx1]<=arr[idx2]){
            merged[x++]=arr[idx1++];
           
        }
        else{
            merged[x++]=arr[idx2++];
           
    }
    while(idx1<=mid){//this statement work if there are some extra elements left in the first array
        merged[x++]=arr[idx1++];
    

    }

    while(idx2<=end){// this works only when there are elements in second array

        merged[x++]=arr[idx2++];
    
    }
    for(int i =0,j=s;i<=merged.length;i++,j++){
        arr[j]=merged[i];
        System.out.printf("the merg sorted array is: ",arr[j]);
    }

    conquer(arr, s,mid,end);
}
}
public static void  divide(int arr[],int s,int end){

    if(s>=end){
        return;
    }

    int mid = s+(end-s)/2;//it is similar to s+end but it helps in space complexity 
    //this is for the first part array dividing{4,3,6,8,2,9}
    divide(arr,s,mid);
    //this calls the second part array to divide{1,88,21,0,63,5}
    divide(arr,mid+1,end);
    /// this is to  conquer the array or the merge the single single array elements of the first part;
    conquer(arr,s,mid,end);
    // this is to conquer the second array elements to merge
    

    


}


    public static void main(String [] args){
        int arr [] ={4,3,6,8,2,9,1,88,21,0,63,5};
        int n = arr.length;
        ///
        divide(arr,0,n-1);

        for(int i = 0;i<=arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();


    }
    
}
