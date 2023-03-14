package Array.TwoD;

import java.util.Scanner;

public class ArraysTwoD {

    public static void printNums() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        // input

        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // output
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void searchInArray() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Number to Search");
        int x = sc.nextInt();
        sc.close();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x if found x printing (i,j)th value
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }

    }

    public static void spiralMatrix() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        // To print spiral order matrix
        // basically till the whole matrix condition is true
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // row remaining same column changing from start to end
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            // row changed
            rowStart++;
            // column remaining same row changing from 2nd row to last as first row is
            // updated before in rowstart++
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            // column end decreased
            colEnd--;
            // row remaining same column decreasing from colend-2 to col start as colEnd is
            // decreased 1 time before in colEnd--
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            // row decreased from end
            rowEnd--;
            // row changing from row end-2 to row start+1 as row end is decreased before and
            // row start is updated after 1st loop
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            // column decreased from front as column is now starting from 2
            colStart++;
            System.out.println();
        }
    }

    public static void transpose() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The transpose is : ");
        // To print transpose
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                // running column till row and row till column
                // printing jth element in i and ith in j hence transposing
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        // printNums();
        // searchInArray();
        // spiralMatrix();
        // transpose();
    }
}
