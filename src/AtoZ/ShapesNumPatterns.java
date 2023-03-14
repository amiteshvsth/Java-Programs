package AtoZ;

import java.util.Scanner;

public class ShapesNumPatterns {
    public static void rectangleNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number til which you want to print: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void hollowRectangleNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers till which you want to print: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void leftTriangleNum() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void leftTriangleRevNum() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void rightTriangleNum() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j >= 6) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void rightTriangleRevNum() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i + j >= 6) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void leftTriangleNum1to15() {
        int number = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void leftTriangleNum15to1() {
        int number = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void palindrome() {
        for (int i = 1; i <= 5; i++) {
            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void numPyramid() {
               
        for (int i = 1; i <= 5; i++) {
            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void rhombusNum() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 13; j++) {
                if (i + j > 6 && i + j < 14) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondNum() {
        for (int i = 1; i <= 5; i++) {
            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void hollowTriangleNum() {
        for (int i=1; i<= 5 ; i++)
        {
            for (int j = i; j < 5 ; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == 5 || k==(2*i-1)) {
                    System.out.print(k);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
      }
      
      public static void hollowTriangleRevNum() {
        for (int i=5; i>= 1 ; i--)
        {
            for (int j = i; j < 5 ; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == 5 || k==(2*i-1)) {
                    System.out.print(k);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
      }
      
      public static void hollowDiamondNum() {
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("");
            } else {
                System.out.println(i);
            }
        }
        for (int i = 5 - 1; i >= 1; i--) {
            for (int j =5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1)
                System.out.println("");
            else
                System.out.println(i);
        }
    }

    public static void pascalTriangle() {
        for (int i = 0; i < 5; i++) {
            int number = 1;
            System.out.printf("%" + (5 - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // rectangleNum();
        // hollowRectangleNum();
        // leftTriangleNum();
        // leftTriangleRevNum();
        // rightTriangleNum();
        // rightTriangleRevNum();
        // leftTriangleNum1to15();
        // leftTriangleNum15to1();
        // zeroOneTriangle();
        // palindrome();
        // numPyramid();
        // rhombusNum();
        // diamondNum();
        // hollowTriangleNum();
        // hollowTriangleRevNum();
        // hollowDiamondNum();
        // pascalTriangle();
    }
}
