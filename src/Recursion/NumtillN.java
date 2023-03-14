package Recursion;

public class NumtillN {
    public static void printNum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        // this condtion is always +1 if we want to print in same order
        printNum(n+ 1);
    }
    public static void main(String[] args) {
        printNum(0);
    }
}
