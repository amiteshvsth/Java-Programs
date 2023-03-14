package Recursion;

public class SumTillN {
     // sum is always assigned 0
     public static void sumTillN(int n, int sum) {
        // base condition reached
        if (n == 0) {
            // printing sum and then exiting
            System.out.println(sum);
            return;
        }
        // adding n value to sum and storing in sum
        sum += n;
        // going from 5 to 0 if 0 check base condition
        sumTillN(n - 1, sum);
    }

    public static void main(String[] args) {
        sumTillN(4, 0);
    }
}
