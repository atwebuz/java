import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Nuri");
        arrayList1.add("Ivan");
        arrayList1.add("Temur");
        arrayList1.add(1,"Temur Indexli");

        arrayList1.set(1, "Masha");
        arrayList1.remove(0);

        System.out.println(arrayList1);

    }
}
