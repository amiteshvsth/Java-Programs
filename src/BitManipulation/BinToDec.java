package BitManipulation;

import java.util.Scanner;

public class BinToDec {

    public int binToDecimal(int binary) {       
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
        return decimal;
    }
    public static void main(String[] args) {
        BinToDec btd = new BinToDec();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt(); // 0101
        sc.close();

        System.out.println(btd.binToDecimal(binary));
    }
}
