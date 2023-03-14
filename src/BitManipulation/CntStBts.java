package BitManipulation;

import java.util.Scanner;

public class CntStBts {
    public int countSetBits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // 0101
        sc.close();

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int count = 0;
        while (n > 0) {
            // count variable is holding value of count+n&1
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        CntStBts cnt = new CntStBts();

        // printing the number of ones
        System.out.println("Ones in this digit are: " + cnt.countSetBits());
    }
}
