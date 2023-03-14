package AtoZ;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ZeroToNinePatterns {
    private char symbol;
    Scanner scanner = new Scanner(System.in);

    public ZeroToNinePatterns() {
        System.out.print("Enter the Symbol you want to print : ");
        symbol = scanner.next().charAt(0);
    }

    public void c0() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c1() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 6 || j == 3 || i + j == 4) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c2() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1 && i > 4 || j == 5 && i < 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c3() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c4() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j == 5 - i + 1 || i == 5 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c5() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1 && i < 5 || i > 3 && j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c6() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1 || i > 3 && j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c7() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 5 - i + 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c8() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5 || j == 1 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void c9() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5 || j == 1 && i < 4 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        ZeroToNinePatterns obj = new ZeroToNinePatterns();
        Class<?> cls = obj.getClass();

        Scanner scanner = new Scanner(System.in);
        char input;

        do {
            System.out.print("Enter the number for which you want to print pattern: ");
            int n = scanner.nextInt();
            String s= Integer.toString(n);

            Method[] methods = cls.getMethods();
            System.out.println(methods);

            System.out.printf("\nThe pattern for %s is : \n\n", n);
            Method methodcall = cls.getDeclaredMethod("c"+s);
            methodcall.invoke(obj);

            System.out.println();
            System.out.println("Press any key to continue 0 to exit");
            input = scanner.next().charAt(0);
            if (input != '0') {
                System.out.print("Enter the Symbol you want to print : ");
                char sym = scanner.next().charAt(0);
                obj.symbol = sym;
            } else {
                break;
            }
        } while (input != '0');
        scanner.close();
    }
}
