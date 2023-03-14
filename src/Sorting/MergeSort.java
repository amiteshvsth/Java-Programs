package Sorting;

public class MergeSort {

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // full array size because si is 0 and ei is length-1
        int idx1 = si;       //tracks 1st array
        int idx2 = mid + 1; // tracks 2nd array
        int x = 0;          //tracks merged array
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        //either of the two below while loop will execute 
        //if one array element are more than other
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        //for copying merged array elements in original array 
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
        
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // (si+ei)/2 causes space complexity in some platforms
        divide(arr, si, mid); //for first array
        divide(arr, mid + 1, ei); // for 2nd array
        conquer(arr, si, mid, ei); //combining both arrays
    }

    public static void main(String[] args) {
        
        int arr[]=Sorting.scan();
        divide(arr, 0, arr.length - 1);
        Sorting.printArray(arr, MergeSort.class.getSimpleName().toString());
    } 
}