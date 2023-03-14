package AtoZ;
import java.util.Scanner;

public class Maths {
    
    public static void areaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius");
        double radius = sc.nextFloat();
        sc.close();
        // calculating area of circle
        double area = 3.14 * radius * radius;
        System.out.print("Area of Circle is: " + area);
    }

    public static void table() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number fow which you want table");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            // printing table of number specified by user
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number ");
        int f = sc.nextInt();
        System.out.print("Enter the operation 1.Addition 2.Substraction 3.Division 4.Multiplication 5.Modulo : ");
        int op = sc.nextInt();
        System.out.print("Enter the second Number ");
        int s = sc.nextInt();
        sc.close();
        switch (op) {
            case 1: {
                System.out.println("The sum of first and second is: " + (f + s));
                break;
            }
            case 2: {
                System.out.println("The substraction of first and second is: " + (f - s));
                break;
            }
            case 3: {
                if (s == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println("The division of first and second is: " + (f / s));
                    break;
                }
            }
            case 4: {
                System.out.println("The multiplication of first and second is: " + (f * s));
                break;
            }
            case 5: {
                if (s == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println("The modulo of first and second is: " + (f % s));
                    break;
                }
            }
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void evenNumTillN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                // printing all even numbers till n
                System.out.print(i + " ");
                sum += i;
            }
        }
        // printing sum of all even numbers till n
        System.out.print("\nThe sum of even numbers till n is: " + sum);
    }

    public static void oddNumTillN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                // printing all odd numbers till n
                System.out.print(i + " ");
                sum += i;
            }
        }
        // printing sum of all odd numbers till n
        System.out.print("\nThe sum of odd numbers till n is: " + sum);
    }

    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;

        // dividing the number from 2 to its halfrange because every number is divided
        // by 1
        for (int i = 2; i <= n / 2; i++) {
            // checking remainder if 0 it is compleately divided hence not prime
            if (n % i == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }

        if (isPrime) {
            if (n == 1) {
                System.out.println("1 is niether Prime nor composite");
            } else if (n == 0) {
                System.out.println("Number is Whole");
            } else {
                System.out.println("Number is Prime");
            }
        } else {
            System.out.println("Number is Not Prime");
        }
    }

    public static void oddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.printf("The factorial of %d is : ", n);
        // running the loop from number-1 to 1 eg number =5 -> then loop will be 4,3,2,1
        for (int i = n - 1; i >= 1; i--) {
            // multiplying the number itself to i
            n *= i;
        }
        System.out.print(n);
    }

    public static void average() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double f = sc.nextDouble();
        System.out.print("Enter Second Number : ");
        double s = sc.nextDouble();
        System.out.print("Enter Third Number : ");
        double t = sc.nextDouble();
        sc.close();
        System.out.println("The average is : " + (f + s + t) / 3);
    }

    public static void posNegZero() {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        char input;

        // we are using do while loop because we know at least 1 time we have to run the
        // loop and after that till the user wishes
        do {
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("Press 1 to continue or else press any key to exit");
            input = sc.next().charAt(0);
        } while (input == '1');
        sc.close();

        // after loop ends all positives, negatives and zeros count are printed
        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeros: " + zero);
    }

    public static void powerOfNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Enter Power : ");
        int power = sc.nextInt();
        int result = 1;
        sc.close();

        System.out.printf("%d^%d is : ", n, power);
        for (int i = 1; i <= power; i++) {
            // firstly 1 is multiplied by n and stored in result after that number is
            // multiplied to itself till the power is mentioned
            result = result * n;
        }
        System.out.print(result);
    }

    public static void gcd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number : ");
        int n2 = sc.nextInt();
        sc.close();
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }

    public static void gcd2() {
        // x and y are the numbers to find the GCF
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int x = sc.nextInt();
        System.out.print("Enter second Number : ");
        int y = sc.nextInt();
        sc.close();
        int gcd = 1;
        // running loop form 1 to the smallest of both numbers
        for (int i = 1; i <= x && i <= y; i++) {
            // returns true if both conditions are satisfied
            if (x % i == 0 && y % i == 0)
                // storing the variable i in the variable gcd
                gcd = i;
        }
        // prints the gcd
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    }

    public static void fibonacci() {
        // fibonacci is the number which is addition of previous 2 numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            // printing fibonacci till nth term
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                // the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // areaOfCircle();
        // table();
        // calc();
        // evenNumTillN();
        // oddNumTillN();
        // checkPrime();
        // factorial();
        // oddEven();
        // average();
        // posNegZero();
        // powerOfNumber();
        // gcd();
        // gcd2();
        // fibonacci();

    }
}
