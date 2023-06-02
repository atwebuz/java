import java.util.LinkedList;
public class LinkedListExp {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Azamat", 4);
        Student2 st3 = new Student2("Nazim", 8);
        LinkedList<Student2> student2LinkedList = new LinkedList();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
            System.out.println(student2LinkedList.get(2));
        Student2 st4 = new Student2("Sanjar", 4);
        Student2 st5 = new Student2("Sanjar 77", 8);
        student2LinkedList.add(st4);
            System.out.println("Linkedlist =" + student2LinkedList);
        student2LinkedList.add(1,st5);
            System.out.println("Linkedlist =" + student2LinkedList);
        student2LinkedList.remove(1);
            System.out.println("Linkedlist =" + student2LinkedList);
    }}
class Student2 {
    String name;
    int course;
    public Student2(String name, int course){
        this.name = name;
        this.course = course;
    }
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                 ", course=" + course +
        '}';
    }
}