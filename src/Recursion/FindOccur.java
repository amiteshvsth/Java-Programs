package Recursion;

public class FindOccur {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, char el, int idx) {
        // now idx at start will be 0
        if (idx == str.length()) {
            return;
        }
        // when current char == element
        if (str.charAt(idx) == el) {
            // if first is -1 then first index is recorded
            if (first == -1) {
                first = idx;
                // after that last value is updated everytime it finds the same charecter
            } else {
                last = idx;
            }
        }
        // ascending order so idx+1
        findOccurence(str, el, idx + 1);
    }

    public static void main(String[] args) {
        findOccurence("abcdefga a  jsggh", 'a', 0);
        System.out.println(first);
        System.out.println(last);
    }
}
