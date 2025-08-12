import java.util.*;

public class Merg {

   
    public static void conquer(int arr[], int si, int mid, int end) {
        int merged[] = new int[end - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Merging two sorted halves
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged array back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int end) {
        if (si >= end) {
            return;
        }

        int mid = si+(end-si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, end);
        conquer(arr, si, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements inside the array:");
        // Fix the loop condition: i < n (not i <= n)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call divide to sort the array
        divide(arr, 0, n - 1);

        System.out.println("The sorted array is:");
        // Fix the loop condition: i < arr.length
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}