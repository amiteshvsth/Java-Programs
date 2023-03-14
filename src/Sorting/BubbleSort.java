package Sorting;

public class BubbleSort {
   
    
    public void bubbleSort(int arr[]) {
        //comparing with the previous number
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    //j will contain j+1 value
                    arr[j] = arr[j + 1];
                    //j+1 element will contain j value as temp is storing j
                    arr[j + 1] = temp;
                }
            }
        } 
        String str= new Exception().getStackTrace()[0].getMethodName();
        Sorting.printArray(arr,str);
    }

    public static void main(String[] args) {

        BubbleSort bbl = new BubbleSort();        
        bbl.bubbleSort(Sorting.scan());
    }
}
