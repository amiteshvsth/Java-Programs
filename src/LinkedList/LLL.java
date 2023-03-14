package LinkedList;
import java.util.*;
public class LLL {
        public static void main(String args[]) {
            LinkedList<String> list = new LinkedList<String>();
            list.addFirst("Radhe");
            list.addFirst("Krishna");
            list.addFirst("Hare");
            System.out.println(list);
            list.add(2, "Radhe");
            System.out.println(list);
        }
    }

