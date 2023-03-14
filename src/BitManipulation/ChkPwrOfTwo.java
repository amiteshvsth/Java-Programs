package BitManipulation;

import java.util.Scanner;

public class ChkPwrOfTwo {
    public  void isPowerofTwo(int n) {
        int cnt = 0;
        while (n > 0) {
            //everytime the number is done and with 1
            if ((n & 1) == 1) {
                // if n&1 == 1 keep incrementing cnt variable
                cnt++; 
            }
            // keep dividing n by 2 using right so that n decreases after every iteration
            n = n >> 1; 
        }
        if (cnt == 1) {
            // if cnt = 1 only then it is power of 2
            System.out.println("Power of Two");
        } else {
            System.out.println("Not Power of Two");
        }
    }

    public static void main(String[] args) {
        ChkPwrOfTwo chk = new ChkPwrOfTwo();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // 0101
        sc.close();
        
        chk.isPowerofTwo(n);
    }
}
