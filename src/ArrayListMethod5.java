import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add("Nuri");
            arrayList1.add("Ivan");
            arrayList1.add("Temur");
            arrayList1.add("Azik");
            arrayList1.add("Temur Indexli");
            System.out.println(arrayList1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
    }
}
