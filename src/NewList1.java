import java.util.ArrayList;
import java.util.*;

public class NewList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elem
        list.add(0);
        list.add(2);
        list.add(8);
        list.add(4);

        System.out.println(list);

        //get elem
        int elem = list.get(0);
        System.out.println(elem);

        //add elem in between
        list.add(1,1);
        System.out.println(list);

        //set elem
        list.set(0,5);
        System.out.println(list);

        //delete elem
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //foreach
        for(Integer i: list) {
            System.out.print(i + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}