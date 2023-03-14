package Recursion;

public class Fibonacci {
    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(a);
        // swappoing by recursion b contains a value and a+b contains b value
        fibonacci(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        fibonacci(0, 1, 5);
    }
}
