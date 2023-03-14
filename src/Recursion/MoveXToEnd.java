package Recursion;

public class MoveXToEnd {
    public static void moveAllX(String str, int idx, int count, String newStr) {
        // idx is storing current charecter if the current charecter reaches to
        // string.length then
        if (idx == str.length()) {
            // running a loop count times that
            for (int i = 1; i <= count; i++) {
                // adds all the x count times to end of new string and
                newStr += 'x'; // newStr =newStr+'x'
            }
            // finally printing newstr
            System.out.println(newStr);

        }
        // if current charecter is x count is increased count is used to keep track of x
        // and current charecter is increased for next iteration
        if (str.charAt(idx) == 'x') {
            moveAllX(str, idx + 1, count + 1, newStr);
            // if current charecter is not x then all index is increased but count remains
            // same
        } else {
            // adding current charecter to end of newStr
            newStr += str.charAt(idx);
            // and then calling for next iteration
            moveAllX(str, idx + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        moveAllX("abcghxnjjgfcxbxgfvxfdcxgxbcxv", 0, 0, "");
    }
}
