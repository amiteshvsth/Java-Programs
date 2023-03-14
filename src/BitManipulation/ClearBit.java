package BitManipulation;
import java.util.Scanner;
public class ClearBit {

    public int clearBit(int n, int pos) {
        // ~ not is used to clear bit
        // clearing a bit means making that bit 0        

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int bitMask = 1 << pos;

        // reversing all the bits of bitmask i.e making 0 to 1 and 1 to 0
        int notBitMask = ~(bitMask);

        // notofBitmask is done & AND with n to clear bit
        int newNumber = notBitMask & n;
        return newNumber;
    }
    
    public static void main(String[] args) {    
        ClearBit cls = new ClearBit();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to Clear bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();

       int result= cls.clearBit(n,pos);
           
        System.out.println("New Number Made: "+result);     
    }
}