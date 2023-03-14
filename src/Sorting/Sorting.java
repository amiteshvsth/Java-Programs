package Sorting;

import java.util.Scanner;

class Sorting {
    
    public static int[] scan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + "th Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
        return arr;               
    }

    public static void printArray(int arr[],String str) {
        //printing name of method used
        //converting 1st letter to capital
        //checking rest string if found capital letter adding space before that
        System.out.println("Method used: "+str.substring(0, 1).toUpperCase()+str.substring(1).replaceAll("([A-Z])", " $1"));

        //printing all elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]) {
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
        printArray(arr,str);
    }

    public static void selectionSort(int arr[]) {
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
        //getting the method currently in  use
        String str= new Exception().getStackTrace()[0].getMethodName();
        printArray(arr,str);
    }

    public static void insertionSort(int arr[]) {
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
        printArray(arr,str);

    }

    public static void main(String args[]) {     

        int arr[] = scan();
        bubbleSort(arr);        
        selectionSort(arr);
        insertionSort(arr);
    }
}