package JavaCollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()){
            return ((Student) obj).id == this.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + this.name + ":" + this.id;
    }
}

public class JavaComparable {
    public static void main(String[] args) {

        Student s1 = new Student("Saurabh",101);
        Student s2 = new Student("Ashwini",102);
        Student s3 = new Student("Temp",103);

        List<Student> list = new ArrayList<>(List.of(s2,s1,s3));
        System.out.println(list);

        Collections.sort(list);
        System.out.println("sorting based on index : " + list);

        list.sort((o1,o2) -> o1.name.length() - o2.name.length());
        System.out.println("sorting based on name : " + list);

    }
}
