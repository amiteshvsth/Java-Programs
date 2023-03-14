package String;
import java.util.Arrays;

public class StringBuilders {

    public static void strBldrFunc() {
        StringBuilder sb = new StringBuilder("tony is a good boy and good human");

        sb.insert(0, 'S');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.append(" Stark");
        System.out.println(sb);

        // // Append 'C'(67) to the String
        sb.appendCodePoint(67);
        System.out.println("Modified StringBuilder = " + sb);

        // // get unicode of char at position 1
        int unicode;
        unicode = sb.codePointAt(1);
        System.out.println("StringBuilder Object" + " contains = " + sb);
        System.out.println("Unicode of Character at Position 1 in StringBuilder = " + unicode);

        // // get unicode of char at index 1
        unicode = sb.codePointBefore(2);
        System.out.println("Unicode of character at position 1 = " + unicode);

        int capacity = sb.capacity();
        System.out.println("Default Capacity of StringBuilder = " + capacity);

        // // apply ensureCapacity()
        sb.ensureCapacity(70);
        System.out.println("After ensureCapacity method capacity = " + sb.capacity());

        char[] array = new char[7];

        // get char from index 0 to 7
        // and store in array start index 0
        sb.getChars(0, 7, array, 0);
        System.out.print("Char array contains : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.fill(array, '_');

        // get char from index 5 to 9
        // and store in array start index 3
        sb.getChars(5, 9, array, 3);
        System.out.print("char array contains : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // get index of string good
        int index;
        index = sb.indexOf("good");
        System.out.println("index of string 'good' = " + index);

        // get lastindex of string hood
        index = sb.lastIndexOf("good");
        System.out.println("Index of last occurrence string \"good\"= " + index);

        // replace Character from index 1 to 7 by "e are "
        StringBuilder strReturn = sb.replace(1, 7, "e are ");
        System.out.println("After Replace() String = " + strReturn);

        // reverse the string
        StringBuilder reverseStr = sb.reverse();
        System.out.println("Reverse String = " + reverseStr);

        // set char at index 2 to 'L'
        sb.setCharAt(2, 'L');
        System.out.println("After setCharAt() String = " + sb);

        // set length equal to 10
        sb.setLength(10);
        System.out.println("After setLength() String = " + sb);

        // get subSequence between index 0 to 7
        System.out.println("SubSequence = " + sb.subSequence(0, 7));

        // get substring start from index 5
        System.out.println("SubSequence = " + sb.substring(5));

        // Random array of string as input
        String gfg[] = { "Are", "You", "A", "Programmer" };

        // Creating object of StringBuilder class
        StringBuilder obj = new StringBuilder();

        // Adding above arrays of strings to
        // Stringbuilder object
        obj.append(gfg[0]);
        obj.append(" " + gfg[1]);
        obj.append(" " + gfg[2]);
        obj.append(" " + gfg[3]);

        // Note if elements are more then
        // we will be using loops to append(add)

        // Creating a single string
        String str = obj.toString();

        // Print and display the above string
        // containing all strings as a single string
        // using toString() method
        System.out.println("Single string generated using toString() method is -> "+ str);

        // applying trimToSize() Method
        sb.trimToSize();
        System.out.println("Capacity after applying trimToSize() = "+ sb.capacity());
    }

    public static void revStringSb() {
        StringBuilder sb = new StringBuilder("HelloWorld");
        for (int i = 0; i < sb.length() / 2; i++) {
            //every time the loop executes front will change front will be the next charecter
            int front = i;
            //every time the loop executes back will change back will be the previous charecter
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            //setting front char at back 
            sb.setCharAt(front, backChar);
            //setting backchar at front
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // strBldrFunc();
        // revStringSb();
    }
}
