package Recursion;

public class Subseq {
    public static void subseq(String str, int idx, String newString) {
        // subsequences meaning if string is "abc"-> substrings are "a" "b" "c" "ab"
        // "ac" "bc" "c","abc"
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        // if we choose the cuurent charecter to be in the new string then add the
        // current char
        subseq(str, idx + 1, newString + str.charAt(idx));
        // if we don't choose the current char in new string
        subseq(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        subseq("abc", 0, "");
    }
}
