package JavaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(10,"Saurabh");
        students.put(3,"Omkar");
        students.put(2,"vikram");
        students.put(1,"TEmp");


        System.out.println(students);
        System.out.println(students.get(4));

        for(int i: students.keySet()){
            System.out.println(i + ":" + students.get(i));
        }

        LinkedHashMap<Integer,String> parents = new LinkedHashMap<>(10,1,true);

        parents.put(2,"vikram");
        parents.put(10,"Saurabh");
        parents.put(3,"Omkar");
        parents.put(1,"TEmp");

        parents.get(2);
        System.out.println(parents);


        for(Map.Entry<Integer,String> entry: parents.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
