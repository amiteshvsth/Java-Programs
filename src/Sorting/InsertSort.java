package Sorting;

public class InsertSort {

    public void insertionSort(int arr[]) {
        //array is divided into 2 part sorted and unsorted
        //assuming the 1st element sorted and rest unsorted

        //now the sorted part's last element is checked with unsorted parts 1st element if found unsorted parts 1st element bigger than taking it in last place of sorted part if found smaller giving space in sorted part before the bigger element and putting the unsorted element there
        
        for (int i = 1; i < arr.length; i++) {
            //taking current element after every iteration current points to next element
            //making unsorted part as current
            int current = arr[i];
            //making sorted part as j
            int j = i - 1;
            //loop till sorted part points to 0th element and sorted array i.e.array[j]which is =array[i-1] is less than array[i] which is initialized as current
            while (j >= 0 && arr[j] > current) {
                // swapping
                //array[j+1]-->array [i]  is initialised array[j] -->array [i-1]
                arr[j + 1] = arr[j];

                //as j is storing i-1 if we decrease -1 j will be i
                //j is initialized with i
                j--;
            }
            arr[j + 1] = current;
        }
        String str= new Exception().getStackTrace()[0].getMethodName();
        Sorting.printArray(arr,str);
    }
    public static void main(String[] args) {
                
        InsertSort ins = new InsertSort();        
        ins.insertionSort(Sorting.scan());
    }
}
