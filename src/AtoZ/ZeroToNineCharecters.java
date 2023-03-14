package AtoZ;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ZeroToNineCharecters {
    private char symbol;

    public ZeroToNineCharecters() {
        symbol = 'a';
    }

    public void c0() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c1() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 6 || j == 3 || i + j == 4) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c2() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1 && i > 4 || j == 5 && i < 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c3() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 5) {
                    System.out.print(symbol); 
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c4() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j == 5 - i + 1 || i == 5 || j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c5() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1 && i < 5 || i > 3 && j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c6() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1 || i > 3 && j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c7() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 5 - i + 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c8() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5 || j == 1 || j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public void c9() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5 || j == 1 && i < 4 || j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol = 'a';
    }

    public static void main(String[] args)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        //creating object of ZeroToNineCharecters class
        ZeroToNineCharecters obj = new ZeroToNineCharecters();

        //accessing class through object
        Class<?> cls = obj.getClass();

        Scanner scanner = new Scanner(System.in);
        char input;

        do {
            System.out.print("Enter the number for which you want to print pattern: ");
            int n = scanner.nextInt();
            String s= Integer.toString(n);

            //getting all methods in the class and storing them in Method classes object i.e methods
            Method[] methods = cls.getMethods();
            System.out.println(methods);

            System.out.printf("\nThe pattern for %s is : \n\n", n);
            //getting the method declared in brackets
            Method methodcall = cls.getDeclaredMethod("c"+s);
            //invoking that method .i.e method call
            methodcall.invoke(obj);

            System.out.println();
            System.out.println("Press any key to continue or 0 to exit");
            input = scanner.next().charAt(0);

        } while (input != '0');
        scanner.close();
    }
}
