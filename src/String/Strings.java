package String;
import java.util.Scanner;

public class Strings {

    public static void eToiReplace() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        sc.close();
        //running loop till string length
        for (int i = 0; i < str.length(); i++) {
           // if found letter e
            if (str.charAt(i) == 'e') {
                //storing it in result
                result += 'i';
            } else {
                //before that storing it in result
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void checkEquality() {
        String name1 = "Tony";
        String name2 = "Tony";

        if (name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // DO NOT USE == to check for string equality
        // Gives correct answer here
        if (name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // Gives incorrect answer here
        if (new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }
    }

    public static void createUsername() {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String userName = "";
        sc.close();
        //running loop till email length
        for (int i = 0; i < email.length(); i++) {
            //if found @ break 
            if (email.charAt(i) == '@') {
                break;
            } else {
               // before that storing it in username
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }

    public static void main(String args[]) {
        // checkEquality();
        // eToiReplace();
        // createUsername();
    }
}