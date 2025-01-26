package CodingPractice.Collection;

//Students: [{name: "Alice", age: 23}, {name: "Bob", age: 21}, {name: "Charlie", age: 25}]
//[{name: "Bob", age: 21}, {name: "Alice", age: 23}, {name: "Charlie", age: 25}]
//Sorted by age

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

class Students implements Comparable<Students>{
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Students o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class ageComparator implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class SortObject {
    public static void main(String[] args) {
        Students s1 = new Students("Alice",23);
        Students s2 = new Students("Bob",21);
        Students s3 = new Students("Charlie",25);

        List<Students> list = new ArrayList<>(List.of(s1,s2,s3));

        //sort by age; Inbuilt define CompareTo method from Comparable Interface
        sort(list);
        System.out.println(list);

        //sort by age in descending order, custom comparator
        list.sort((a,b) -> b.age - a.age);
        System.out.println(list);

        //sort by name in descending order, custom comparator
        list.sort(new ageComparator());
        System.out.println(list);


    }


}
