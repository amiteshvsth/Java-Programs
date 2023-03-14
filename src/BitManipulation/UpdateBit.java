package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public void updateBit() {
        //updating a bit means changing if 0 then changing to 1 and if 1 changing to zero at the specified position
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to Update bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();

        System.out.println("Enter The Operation: 1.set changing to 1  0.Changing to 0 ");
        // oper=1 -> set; oper=0 -> clear
        int oper = sc.nextInt();
        sc.close();

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println("New Number: "+newNumber);
        }
    }

    public static void main(String[] args) {
        UpdateBit updt = new UpdateBit();
        updt.updateBit();
    }
}
