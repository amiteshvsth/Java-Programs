package Recursion;

public class RevNum {
    public static void printNumRev(int n) {
        // exit or base condition
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // this condtion is always -1 if we want to reverse
        printNumRev(n - 1);
    }

    public static void main(String[] args) {
        printNumRev(987);
    }
}
