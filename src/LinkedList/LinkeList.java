package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkeList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(9);
        list.add(5);
        list.add(8);


        list.addFirst(4);
        System.out.println(list);

        list.addFirst(7);
        System.out.println(list);

        list.addLast(0);
        System.out.println(list);

        list.addLast(8);
        System.out.println(list);

        list.add(0, 3);
        System.out.println(list);


        System.out.println(list.get(4));
        System.out.println(list.size());

        list.removeLast();
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
