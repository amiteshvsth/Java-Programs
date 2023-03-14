package AtoZ;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AtoZcharecters {

    //making char private and accessing it in constructor
    private char symbol; 

    //Constructor of class
    public AtoZcharecters() {  
       symbol='a';
    }

    public void a() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1 || j == 5) {
                    System.out.print(symbol);
                    //everytime the letter is printed it is updated to next letter
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //after compleate printing the variable is again set to a so that the other when requested to print will start from 'a'
        symbol='a';
    }

    public void b() { 
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
        symbol='a';
    }

    public void c() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void d() { 
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 5 || j == 3 || j == 7) {

                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void e() {  
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 != 0 || j == 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void f() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void g() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 1 || i == 6 && j < 5 || j == 4 && i > 3 || j == 7 && i > 3 || i == 4 && j == 5 || i == 4 && j == 6) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void h() { 
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 || j == 1 || j == 5) {

                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void i() {
     for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 3 || i == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void j() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 || j == 5 || i == 6 && j < 6 || i > 3 && j == 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void k() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i + j == 6) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 5; i > 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i + j == 7) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void l() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void m() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 11; j++) {
                if (j == 1 || j == 11 || j == i + 1 && i < 6 || i + j == 11 && i < 6) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void n() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1 || j == 9 || j == i + 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void o() {
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
        symbol='a';
    }

    public void p() {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5 && i < 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void q() {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 5 || j == 1 && i < 6 || j == 7 && i < 6 || j == 4 && i > 3 || i == 7 && j > 3) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void r() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == i + 2 || j == 1) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void s() {
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
        symbol='a';
    }

    public void t() { 
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 || j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void u() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 1 || j == 5) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void v() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i + j == 11 || i == j) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void w() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 15; j++) {
                if (i + j == 11 && i > 2 || i == j || i + 5 == j && i > 2 || i + j == 16) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void x() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i || i + j == 6) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void y() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i && j < 4 || i + j == 6) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    public void z() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || i + j == 6) {
                    System.out.print(symbol);
                    symbol++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        symbol='a';
    }

    //main function throwing exceptions
    public static void main(String[] args)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        // creating object of class
        AtoZcharecters obj = new AtoZcharecters();

        //getting class name from object
        Class<?> cls = obj.getClass();

        Scanner scanner = new Scanner(System.in);
        char input;
        do {

            System.out.print("Enter the charecter for which you want to print pattern: ");
            String ch = scanner.next();

            //storing all methods of class in Method class's object 
            //method is Method class's object
            Method[] method = cls.getMethods();
            System.out.println(method);

            System.out.printf("\nThe pattern for %s is : \n\n", ch);

            //.getDeclaredMethod is used to call the methods of Method class
            //ch is the method to be called
            //if the method has parameters then it should be seperated by comma
            //like this getDeclaredMethod(ch,String str);
            Method methodcall = cls.getDeclaredMethod(ch);

            // now methodcall is storing the value of declared method ch
            //.invoke is used to call a method
             //if the method has parameters then it should be seperated by comma
            //like this invoke(obj, "abc");
            methodcall.invoke(obj);

            System.out.println("\nPress any key to continue 0 for exit ");
            input = scanner.next().charAt(0);
        } while (input !='0');
        scanner.close();
    }
}
