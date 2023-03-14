package BitManipulation;
import java.util.Scanner;

public class BitManipulation {

    public static void setBit() {
        // | OR is used to set bit
        // setting a bit means making that bit 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to set bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();
        System.out.println("Binary of your number: " + Integer.toBinaryString(n));

        // calculating bitmask
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }

    public static void getBit() {
        // & AND is used to get bit
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to get bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int bitMask = 1 << pos;

        //all the elements of bitmask are done & AND with n if the answer contains all zeros bit is zero if the answer contain any 1 bit is one
        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }

    public static void clearBit() {

        // ~ not is used to clear bit
        // clearing a bit means making that bit 0
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to Clear bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int bitMask = 1 << pos;

        // reversing all the bits of bitmask i.e making 0 to 1 and 1 to 0
        int notBitMask = ~(bitMask);

        // notofBitmask is done & AND with n to clear bit
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }

    public static void toggleBit() {
        //changing all the bits if 0 then changing to 1 andd if 1 changing to 0
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to Toggle bits : ");
        int n = sc.nextInt(); // 0101
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        sc.close();

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int bitMask = 1 << pos;
        //^ is done to toggle bits
        int newNumber = bitMask ^ n;
        System.out.println(newNumber);
    }

    public static void updateBit() {
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
            System.out.println(newNumber);
        }
    }

    public static void isPowerofTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // 0101
        sc.close();
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

    public static void countSetBits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); // 0101
        sc.close();

        System.out.println("Binary of your number: " + Integer.toBinaryString(n));
        int count = 0;
        while (n > 0) {
            //count variable is holding value of  count+n&1
            count += n & 1;
            n >>= 1;
        }
        // printing the number of ones
        System.out.println("Ones in this digit are: " + count);
    }

    public static void decToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int decimal = sc.nextInt(); // 0101
        sc.close();

        System.out.println("Binary of your number: " + Integer.toBinaryString(decimal));

        int binary[] = new int[40];
        int index = 0;
        //if the number entered by user is greater than zero
        while (decimal > 0) {
            //binary array is containg remainder of decimal%2 and everytime index is increased to iterate every element of binary array
            binary[index++] = decimal % 2;
            //number is divided  by 2 so that after every iteration number decreases
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            //printing binary array
            System.out.print(binary[i]);
        }
    }

    public static void binToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt(); // 0101
        sc.close();

        //converting int to string
        String bin=String.valueOf(binary);

        //getting binary
        System.out.println("The Decimal of Your Number is: "+Integer.parseInt(bin,2));
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                //temp variable will hold remainder of binary%10
                int temp = binary % 10; 
                //decimal will hold the value of decimal+remainder in temp*2^n
                decimal += temp * Math.pow(2, n);
                 //number is divided  by 10 so that after every iteration number decreases
                binary = binary / 10;
                //everytime the loop runs the n is increases so the power increases till the loop executes
                n++;
            }
        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        // getBit();
        // setBit();
        // clearBit();
        // updateBit();
        // toggleBit();
        // isPowerofTwo();
        // countSetBits();
        // decToBinary();
        // binToDecimal();
    }
}
