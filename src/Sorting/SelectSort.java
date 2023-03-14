package Sorting;

public class SelectSort {
   
    public void selectionSort(int arr[]) {
        //making the first as smallest and comparing it with others if found other smallest
        //storing that in smallest variable and then comparing with that
        for (int i = 0; i < arr.length - 1; i++) {
            //every time the loop executes smallest is now the coming number  hence skipping previous
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            //temp contains smallest value
            int temp = arr[smallest];
            //smallest contains arr[i] value
            arr[smallest] = arr[i];
            //arr i contains smallest value as temp was storing smallest
            arr[i] = temp;
        }
        String str= new Exception().getStackTrace()[0].getMethodName();
        Sorting.printArray(arr,str);
    }
public static void main(String[] args) {

        SelectSort slc = new SelectSort();        
        slc.selectionSort(Sorting.scan());
}
}
