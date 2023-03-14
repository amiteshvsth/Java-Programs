package BitManipulation;

import java.util.Scanner;

public class DectoBinary {
    public void decToBin(int decimal) {
        
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

    public static void main(String[] args) {
        DectoBinary dtb = new DectoBinary();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int dec = sc.nextInt(); // 0101
        sc.close();

        dtb.decToBin(dec);
    }
}
