import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm',22,2,7.2);
        Student st2 = new Student("Nurik", 'm',22,3,5.2);
        Student st3 = new Student("Azik", 'm',23,1,9.2);
        Student st4 = new Student("Alisa", 'j',18,2,6.2);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        System.out.println(studentArrayList);
        Student st5 = new Student("Madina", 'j',18,2,6.2);
        studentArrayList.remove(st4);
        System.out.println(studentArrayList);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age,int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='"+ name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}