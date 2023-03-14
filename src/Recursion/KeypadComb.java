package Recursion;

public class KeypadComb {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void keypadCombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        // curr holding the current charecter value
        char curr = str.charAt(idx);

        // suppose if current char is 2 then mapping =2-0=2where d,e,f are stored
        String mapping = keypad[curr - '0'];
        // mapping length here means if current char is 2 then mapping lenth will be 3
        // as the 2nd index in keypad array is holding 3 values d,e,f
        for (int i = 0; i <= mapping.length(); i++) {
            // if 23 adding-?>d then e then f and then calling next level
            // ->dg,dh,di,eg,eh,ei,fg,fh,fi
            keypadCombination(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        keypadCombination("23", 0, "");
    }
}
