package Recursion;

import java.util.HashSet;

public class UniqSubseq {
    public static void uniqueSubseq(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            // if set contains new string then return
            if (set.contains(newString)) {
                return;
            } else {
                // else printing new string
                System.out.println(newString);
                // adding new string in hashset then returning
                set.add(newString);
                return;
            }
        }
        // if we choose the charecter to be
        uniqueSubseq(str, idx + 1, newString + str.charAt(idx), set);
        // if we don't choose the charecter to be
        uniqueSubseq(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSubseq("aaa", 0, "", set);
    }
}
