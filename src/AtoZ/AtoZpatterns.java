package AtoZ;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AtoZpatterns {
    private char symbol; 
    Scanner scanner= new Scanner(System.in);
    public AtoZpatterns() {  
        System.out.print("Enter the Symbol you want to print : ");
        symbol = scanner.next().charAt(0); 
    }

    public void a() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1 || j == 5) {
                    System.out.print(symbol);
                   
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void b() {
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

    public void c() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void d() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 5 || j == 3 || j == 7) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void e() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 != 0 || j == 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void f() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void g() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 1 || i == 6 && j < 5 || j == 4 && i > 3 || j == 7 && i > 3 || i == 4 && j == 5
                        || i == 4 && j == 6) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void h() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 || j == 1 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void i() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 3 || i == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void j() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 || j == 5 || i == 6 && j < 6 || i > 3 && j == 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void k() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i + j == 6) {
                    System.out.print(symbol);
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
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void l() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void m() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 11; j++) {
                if (j == 1 || j == 11 || j == i + 1 && i < 6 || i + j == 11 && i < 6) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void n() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1 || j == 9 || j == i + 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void o() {
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

    public void p() {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5 && i < 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void q() {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 5 || j == 1 && i < 6 || j == 7 && i < 6 || j == 4 && i > 3 || i == 7 && j > 3) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void r() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print(symbol);
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
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void s() {
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

    public void t() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void u() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 1 || j == 5) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void v() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i + j == 11 || i == j) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void w() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 15; j++) {
                if (i + j == 11 && i > 2 || i == j || i + 5 == j && i > 2 || i + j == 16) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void x() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i || i + j == 6) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void y() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i && j < 4 || i + j == 6) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void z() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || i + j == 6) {
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

        AtoZpatterns obj = new AtoZpatterns();
        Class<?> cls = obj.getClass();

        Scanner scanner = new Scanner(System.in);
        char input;
     
        do {
            System.out.print("Enter the charecter for which you want to print pattern: ");
            String ch = scanner.next();

            Method[] methods = cls.getMethods();
            System.out.println(methods);
            
            System.out.printf("\nThe pattern for %s is : \n\n", ch);
            Method methodcall = cls.getDeclaredMethod(ch);
            methodcall.invoke(obj);
            
            System.out.println("Press any key to continue 0 for exit ");
            input=scanner.next().charAt(0);
            if (input!='0') {
                System.out.print("Enter the Symbol you want to print : ");
                char sym = scanner.next().charAt(0); 
                // synching the symbol to the sym so that the user can get chance to change the symbol
                obj.symbol=sym;
            } else {
                break;
            }
        } while (input !='0');
        scanner.close();
    }
}
