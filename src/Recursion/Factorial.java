package Recursion;

public class Factorial {
    public static void factorial(int n, int fact) {
        // base condition 1 because multiplied by 0 will give 0
        if (n == 1) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(n - 1, fact);
    }

    public static void main(String[] args) {
        factorial(6, 1);
    }
}
