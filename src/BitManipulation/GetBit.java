package BitManipulation;

import java.util.Scanner;

public class GetBit {
    
    public int getBit(int n, int pos) {
        // & AND is used to get bit

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int bitMask = 1 << pos;

        // all the elements of bitmask are done & AND with n if the answer contains all
        // zeros bit is zero if the answer contain any 1 bit is one
        if ((bitMask & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        GetBit g = new GetBit();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to get bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();

        System.out.println("Bit was: "+ g.getBit(n,pos));       
    }
}
