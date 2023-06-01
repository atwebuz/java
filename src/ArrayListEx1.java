import java.util.ArrayList;
public class ArrayListEx1 {
    public static void main(String[] args){
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Nuri");
        arrayList1.add("Ivan");
        arrayList1.add("Temur");
        System.out.println(arrayList1);


        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList1 == arrayList2);

    }
}
