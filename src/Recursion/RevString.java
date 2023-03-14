package Recursion;

public class RevString {
    public static String revString(String str) {
        if (str.length() == 1) {
            System.out.println(str);
            return str;
        }
        // getting current charecter
        char currChar = str.charAt(0);
        // taking elememts of str from 1
        // printed 0th element
        // string length is decreased by 1 everytime as the strong starts from 1
        String nextString = revString(str.substring(1));
        // printing charecter at last of new string
        return nextString + currChar;
    }

    public static void revString2(String str, int idx) {
        // idx at start = str.length-1 to 0
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        // printing last then second last thats how reversing a string
        System.out.println(str.charAt(idx));
        // everytime idx is recuced by 1
        revString2(str, idx - 1);
    }

    public static void main(String[] args) {
       System.out.println(revString("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
       
       revString2("ABC",2);
    }
}
