package Recursion;

public class Power {
    public static int power(int x, int n) {
        // stack height n means stack is created till the power
        if (n == 0) {
            // if power is zero it will return 1 because any numbers power 0 is 1
            return 1;
        }
        if (x == 0) {
            // if number is 0 no matter how muvch is the power the result will be 0
            return 0;
        }
        // power is decreased everytime
        int x_ = power(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    public static int printPower(int x, int n) {
        // stack height logn because conditions are half now
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            // if even
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            // if odd
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void main(String[] args) {        
        System.out.println(power(2, 3));

        System.out.println(printPower(2, 4));  
    }
}
