package BitManipulation;
import java.util.Scanner;

public class ToggleBit {
    public int toggleBit(int n, int pos) {
        //changing all the bits if 0 then changing to 1 andd if 1 changing to 0        
        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int bitMask = 1 << pos;
        //^ is done to toggle bits
        int newNumber = bitMask ^ n;
        return newNumber;
    }

    public static void main(String[] args) {
        ToggleBit tgl = new ToggleBit();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to Toggle bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();

        System.out.println("New Number: "+tgl.toggleBit(n, pos));
        
    }
}
