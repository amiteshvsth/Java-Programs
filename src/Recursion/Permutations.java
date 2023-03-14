package Recursion;

public class Permutations {
    public static void permutation(String str, String perm) {
        if (str.length() == 0) {
            System.out.print(perm); // abc>acb>bac>bca>cab>cba
            return;
        }

        // running loop till string length getting every element in str
        for (int i = 0; i < str.length(); i++) {
            // current charecter storing the value of ith index element assume 'a'->'b'->c
            char currChar = str.charAt(i);
            // System.out.println("\nCurrent charecter: "+currChar);
            // newStr holding the value of i='0 to i-1 as i is not included + (i+1) that
            // means current charecter is excluded
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // (bc,a)>(c,ab)>('',abc)return>(ac,b)>(c,ba)>('',bac)>return
            // System.out.println("New String: "+newStr);
            permutation(newStr, perm + currChar);
        }
    }

    public static void main(String[] args) {
        // permutation means all possible changes that can happen in a string
        // ->abc,acb->bac,bca->cab,cba
        permutation("abc", "");
    }
}
