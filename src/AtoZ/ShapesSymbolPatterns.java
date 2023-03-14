package AtoZ;

import java.util.Scanner;

public class ShapesSymbolPatterns {
    
    public static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of symbols is one line: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void hollowRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of symbols in first and last line: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void leftTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void leftTriangleRev() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void leftTriangleHollow() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1 || i == rows) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void leftTriangleHollowRev() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1 || i == rows) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rightTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of symbols in one line: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i + j >= rows + 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void rightTriangleRev() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows; j++) {
                if (i + j >= rows + 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void rightTriangleHollow() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of symbols in last line: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i + j == rows + 1 || i == rows || j == cols) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rightTriangleHollowRev() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of symbols in last line: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= cols; j++) {
                if (i + j == rows + 1 || i == rows || j == cols) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= rows; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void rhombusHollow() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        int i, j;
        for (i = 1; i <= rows; i++) {
            // Print trailing spaces
            for (j = 1; j <= rows - i; j++)
                System.out.print(" ");

            // Print stars after spaces
            // Print stars for each solid rows
            if (i == 1 || i == rows)
                for (j = 1; j <= rows; j++)
                    System.out.print(symbol);

            // stars for hollow rows
            else
                for (j = 1; j <= rows; j++)
                    if (j == 1 || j == rows)
                        System.out.print(symbol);
                    else
                        System.out.print(" ");
            // Move to the next line/row
            System.out.println();
        }
    }

    public static void pyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();

        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void pyramidRev() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = rows; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void pyramidHollow() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lines : ");
        int rows = sc.nextInt();
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++)

            {
                System.out.print(" ");
            }
            if (i == 1 || i == rows)
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    System.out.print(c);
                }
            else {
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    if (j == 1 || j == i * 2 - 1)
                        System.out.print(c);
                    else

                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramidHollowRev() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);
        sc.close();
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)

            {
                System.out.print(" ");
            }
            if (i == 1 || i == n)
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    System.out.print(c);
                }
            else {
                for (int j = 1; j <= i * 2 - 1; j++)

                {
                    if (j == 1 || j == i * 2 - 1)
                        System.out.print(c);
                    else

                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Symbol you want to print: ");
        char symbol = sc.next().charAt(0);
        sc.close();
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void diamondHollow() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        // reads an integer (rows) from the user
        int rows = scan.nextInt();
        System.out.print("Enter the symbol you want to print: ");
        // reads the symbol from the user
        char symbol = scan.next().charAt(0);
        scan.close();
        // prints upper section of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                // prints space
                System.out.print(" ");
            }
            // prints symbol
            System.out.print(symbol);
            for (int j = 1; j < (i - 1) * 2; j++) {
                // prints space
                System.out.print(" ");
            }
            if (i == 1) {
                // throws cursor to the next line
                System.out.print("\n");
            } else {
                // prints symbol and throws cursor to the next line
                System.out.print(symbol + "\n");
            }
        }
        // prints lower section of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                // prints space
                System.out.print(" ");
            }
            // prints symbol
            System.out.print(symbol);
            for (int j = 1; j < (i - 1) * 2; j++) {
                // prints space
                System.out.print(" ");
            }
            if (i == 1) {
                // throws cursor to the next line
                System.out.print("\n");
            } else {
                // prints symbol and throws cursor to the next line
                System.out.print(symbol + "\n");
            }
        }
    }

    public static void butterfly() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the symbol you want to print: ");
        // reads the symbol from the user
        char symbol = scan.next().charAt(0);
        scan.close();
        int n = 4;
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void butterflyHollow() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the symbol you want to print: ");
        // reads the symbol from the user
        char symbol = scan.next().charAt(0);
        scan.close();
        int n = 5;
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j==i||j==1) {
                    System.out.print(symbol);
                }
                else{
                    System.out.print(" ");
                }
            }

            int spaces = 2 * n - 2*i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j==1||j==i) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j==i||j==1) {
                    System.out.print(symbol);
                }
                else{
                    System.out.print(" ");
                }
            }

            int spaces = 2 * n - 2*i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j==1||j==i) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // rectangle();
        // hollowRectangle();
        // leftTriangle();
        // leftTriangleRev();
        // leftTriangleHollow();
        // leftTriangleHollowRev();
        // rightTriangle();
        // rightTriangleRev();
        // rightTriangleHollow();
        // rightTriangleHollowRev();
        // rhombus();
        // rhombusHollow();
        // pyramid();
        // pyramidRev();
        // pyramidHollow();
        // pyramidHollowRev();
        // diamond();
        // diamondHollow();
        // butterfly();
        // butterflyHollow();
    }
}
