import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExmp {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Nuri");
        arrayList1.add("Ivan");
        arrayList1.add("Temur");
        arrayList1.add("Azik");
        System.out.println(arrayList1);

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
