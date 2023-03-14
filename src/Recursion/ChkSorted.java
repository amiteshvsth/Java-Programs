package Recursion;

import java.util.Scanner;

public class ChkSorted {
    public static boolean checkIfIncreasing(int arr[], int idx) {
        // now idx at start will be 0 because condition below is idx+1
        // if idx is gone till array.length then the array is obviously sorted hence
        // returns true
        if (idx == arr.length - 1) {
            return true;
        }
        // if not increasing returns false
        if (!checkIfIncreasing(arr, idx + 1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scn.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th Element");
            arr[i] = scn.nextInt();
        }
        scn.close();
        if (checkIfIncreasing(arr, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }
    }
}
