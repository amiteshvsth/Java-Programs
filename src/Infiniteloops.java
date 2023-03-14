public class Infiniteloops {

    public static void infiniteFor() {
        //ending condition is not mentioned so the loop is infinite
        for (;;) {
            System.out.println("Tera Naam");
        }
    }

    public static void infiniteWhile() {
        int input = 1;
        //condition is always true so the loop is Infinite
        while (input==1) {
            System.out.println("Tera Naam");
        }
    }

    public static void infiniteDoWhile() {
        //condition is always true so the loop is Infinite
        int input = 1;
        do {
            System.out.println("Tera Naam");
        } while (input == 1);
    }

    public static void main(String[] args) {
        infiniteDoWhile();
        infiniteFor();
        infiniteWhile();
    }
}
