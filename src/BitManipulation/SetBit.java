package BitManipulation;
import java.util.Scanner;

public class SetBit {

    public int setBit(int n, int pos) {
        // | OR is used to set bit
        // setting a bit means making that bit 1
        System.out.println("Binary of your number: " + Integer.toBinaryString(n));

        // calculating bitmask
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        return newNumber;
    }


    public static void main(String[] args) {
        SetBit s =new SetBit();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to set bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();
        
        System.out.println("New Number: "+s.setBit(n,pos));
        
    }
}
