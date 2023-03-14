package Recursion;

public class RemDupl {
    // declaring boolean array in which default value is false for every index
    public static boolean[] present = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr) {
        // idx is storing current charecter if the current charecter reaches to
        // string.length then
        if (idx == str.length()) {
            // printing newStr and then return
            System.out.println(newStr);
            return;
        }
        // curr storring the value at index
        char curr = str.charAt(idx);
        // because array lenth starts from 0 a is substracted
        if (present[curr - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            // curr is added to newStr
            newStr += curr;
            // and making the charecter true so that if found next time not printing it
            present[curr - 'a'] = true;
            // idx value updated for next iteration
            removeDuplicates(str, idx + 1, newStr);
        }
    }


    public static void main(String[] args) {
        removeDuplicates("abcdfgfsacvacdbbcda", 0, "");
    }
}
