package AtoZ;

public class ShapesAlphaPatterns {

    /*
        A 
        B B 
        C C C 
        D D D D 
        E E E E E 
        F F F F F F
     */
    public static void leftTriangleAlpha() {
        int alphabet = 65;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }

        /*
    A A A A A A 
    B B B B B
    C C C C
    D D D
    E E
     */
    public static void leftTriangleRevAlpha() {
        int alphabet = 65;
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }

    /*
             A 
            A B
           A B C
          A B C D
         A B C D E
        A B C D E F
     */
    public static void pyramidAlpha() {
        for (int i = 0; i <= 5; i++) {
            int alphabet = 65;
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }

    /*
        A B C D E F 
         A B C D E
          A B C D 
           A B C
            A B
     */
    public static void pyramidRevAlpha() {
        for (int i = 5; i >= 1; i--) {
            int alphabet = 65;
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // leftTriangleAlpha();
        // leftTriangleRevAlpha();
        // pyramidAlpha();
        // pyramidRevAlpha();
    }
}