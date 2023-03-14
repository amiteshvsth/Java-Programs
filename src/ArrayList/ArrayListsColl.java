package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsColl {
    
    public static void main(String[] args) {
        ArrayList<String>list =new ArrayList<String>();
        list.add("Hare");
        list.add("Krishna");
        list.add("Ram");

        // hare krishna, hare krishna , krishna krishna, hare hare
        // hare  ram,    hare  ram,      ram     ram,    hare hare
        System.out.println(list); 

        System.out.print(list.get(0)+" ");
        System.out.print(list.get(1)+" ");
        System.out.print(",");
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(1)+" ");
        System.out.print(",");
        System.out.print(list.get(1)+" ");
        System.out.print(list.get(1)+" ");
        System.out.print(",");
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(0)+" ");
        System.out.println();
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(2)+" ");
        System.out.print(",");
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(2)+" ");
        System.out.print(",");
        System.out.print(list.get(2)+" ");
        System.out.print(list.get(2)+" ");
        System.out.print(",");
        System.out.print(list.get(0)+" ");
        System.out.print(list.get(0)+" ");
        System.out.println();

        //shifts the older elements to the right
        list.add(1,"Krishna");
        System.out.println(list);

        //replaces the older element
        list.set(2, "Hare");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }    


}
