package Recursion;
import java.util.*;

public class Recursion {

    // printing reverse numbers till 0
    public static void printNumRev(int n) {
        // exit or base condition
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // this condtion is always -1 if we want to reverse
        printNumRev(n - 1);
    }

    // printing numbers till 6
    public static void printNum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        // this condtion is always +1 if we want to print in same order
        printNum(n+ 1);
    }

    // sum is always assigned 0
    public static void sumTillN(int n, int sum) {
        // base condition reached
        if (n == 0) {
            // printing sum and then exiting
            System.out.println(sum);
            return;
        }
        // adding n value to sum and storing in sum
        sum += n;
        // going from 5 to 0 if 0 check base condition
        sumTillN(n - 1, sum);
    }

    public static void factorial(int n, int fact) {
        // base condition 1 because multiplied by 0 will give 0
        if (n == 1) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(n - 1, fact);
    }

    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(a);
        // swappoing by recursion b contains a value and a+b contains b value
        fibonacci(b, a + b, n - 1);
    }

    public static int power(int x, int n) {
        // stack height n means stack is created till the power
        if (n == 0) {
            // if power is zero it will return 1 because any numbers power 0 is 1
            return 1;
        }
        if (x == 0) {
            // if number is 0 no matter how muvch is the power the result will be 0
            return 0;
        }
        // power is decreased everytime
        int x_ = power(x, n - 1);
        int xn = x * x_;
        return xn;
    }

    public static int printPower(int x, int n) {
        // stack height logn because conditions are half now
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            // if even
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            // if odd
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        // transfer n-1 from helper to dest using src as 'helper' basically swapping
        towerOfHanoi(n - 1, helper, src, dest);
    }

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

    public static boolean checkIfIncreasing(int arr[], int idx) {
        // now idx at start will be 0 because condition below is idx+1
        // if idx is gone till array.length then the array is obviously sorted hence
        // returns true
        if (idx == arr.length - 1) {
            return true;
        }
        // if not increasing returns false
        if (!checkIfIncreasing(arr, idx + 1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];
    }

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

    // time complexity here is choices^charectersInString -> 2^3->2^n
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

    // static array of strings holding keypad combinations
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
            // newStr holding the value of i='0 to i-1 as i is not included + (i+1) that means current charecter is excluded
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // (bc,a)>(c,ab)>('',abc)return>(ac,b)>(c,ba)>('',bac)>return
            // System.out.println("New String: "+newStr);
            permutation(newStr, perm + currChar);
        } 
    }

    public static int countPaths (int i ,int j, int n, int m ){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==n-1){
            return 1;
        }
        int downPaths = countPaths(i+1, j, n, m);

        int rightPaths = countPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }

    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertPlaced=placeTiles(n-m, m);

        int horiPlaced=placeTiles(n-1,m);

        return vertPlaced+ horiPlaced;
    }

    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }

        int ways1 =callGuests(n-1);

        int ways2 =(n-1)* callGuests(n-2);
        
        return ways1+ways2;
    }

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //add hoga     
        subset.add(n);
        findSubsets(n-1,subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.print(
                    "Which program do you want to run?\n1.numbers from 5 to 1\n2.numbers from 1 to 5\n3.sum of numbers till n\n4.factorial\n5.fibonacci\n6 and 7.power of number\n8.Tower of hanoi\n9. and 10 reverse a string\n11.finding first and last occurence\n12. check if array is strictly increasing\n13.move all x to the end\n14.remove duplicates\n15.print subsequences\n16.printing unique subsequences\n17.keypad combination\n18.printing permutation\n19.Count Paths\n20.Place Tiles\n21.Call Guests\n22.Subset\nEnter the Number: ");
            int num = sc.nextInt();

            switch (num) {
                case 1: {
                    printNumRev(5);
                    break;
                }
                case 2: {
                    printNum( 1); // 1 to 5
                    break;
                }
                case 3: {
                    sumTillN(5, 0); // 5 to 1
                    break;
                }
                case 4: {
                    factorial(5, 1); // factorial of 5
                    break;
                }
                case 5: {
                    fibonacci(0, 1, 5); // fibonacci numbers till nth element
                    break;
                }
                case 6: {
                    int output = power(5, 2);
                    System.out.println(output); // x^n
                    break;
                }
                case 7: {
                    int op = printPower(5, 2);
                    System.out.println(op);// x^n
                    break;
                }
                case 8: {
                    // tower of hanoi
                    towerOfHanoi(3, "A", "B", "C");
                    break;
                }
                case 9: {
                    // reverse string
                    revString("abcdegfdggnmghdj");
                    break;
                }
                case 10: {
                    String str = "abcdfghgshjhjkgk";
                    revString2(str, str.length() - 1);
                    break;
                }
                case 11: {
                    // find first and last occurence in string
                    String str="abcdaagghaafrgaaka";
                    findOccurence(str, 'a', 0);
                    System.out.println("First occurence : " + first);
                    System.out.println("Last occurence : " + last);
                    break;
                }
                case 12: {
                    // check if array is Strictly increasing
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Enter the size of array");
                    int size = sc.nextInt();
                    int arr[] = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.println("Enter " + (i + 1) + "th Element");
                        arr[i] = sc.nextInt();
                    }
                    scn.close();
                    if (checkIfIncreasing(arr, 0)) {
                        System.out.println("Strictly Increasing");
                    } else {
                        System.out.println("NOT Strictly Increasing");
                    }
                    break;
                }
                case 13: {
                    // move all x to end
                    moveAllX("abcghxnjjgfcxbxgfvxfdcxgxbcxv", 0, 0, "");
                    break;
                }
                case 14: {
                    // remove duplicates in string
                    removeDuplicates("abcdfgfsacvacdbbcda", 0, "");
                    break;
                }
                case 15: {
                    // print subsequence
                    subseq("abc", 0, "");
                    break;
                }
                case 16: {
                    // print unique subsequence
                    // hashset is a array which contains unique values
                    HashSet<String> set = new HashSet<>();
                    uniqueSubseq("aaa", 0, "", set);
                    break;
                }
                case 17: {
                    // printing keypad combination
                    keypadCombination("23", 0, "");
                    break;
                }
                case 18: {
                    // permutation means all possible changes that can happen in a string
                    // ->abc,acb->bac,bca->cab,cba
                    permutation("abc", "");
                    break;
                }
                case 19: {
                    int n=3, m=3;
                    int totalPaths = countPaths(0,0,n,m);
                    System.out.println(totalPaths);
                    break;
                }
                case 20: {
                    int n=4, m=2;
                     System.out.println(placeTiles(n,m));
                     break;
                }
                case 21:{
                    int n =4 ;
                    System.out.print(callGuests(n));
                    break;
                }
                 case 22:{
                    int n =3 ;
                    ArrayList<Integer> subset =new ArrayList<>();
                    findSubsets(n,subset);
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
            System.out.print("\nPress any key to exit 1 to continue: ");
            input = sc.nextInt();
        } while (input == 1);
        sc.close();
    }
}
