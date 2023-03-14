package Array;

public class Arrays {

    public static void maxMinArray() {
        int numbers[] = { 7, 8, 99, 44, 999 };
        // max is storing min value that a integer can store
        int max = Integer.MIN_VALUE;
        // min is storing max value that a integer can store
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // everytime the numbers is less than .MAX_VALUE[min] min is updated
            if (numbers[i] < min) {
                min = numbers[i];
            }
            // everytime the numbers is greater than MIN_VALUE[max] max is updated
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }

    public static void isSortedArray() {
        int arr[] = { 7, 8, 99, 48, 999 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {

            // if 0th element is greater than 1st element is sorted will be false
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }

    public static void main(String args[]) {
        maxMinArray();
        isSortedArray();
    }

}