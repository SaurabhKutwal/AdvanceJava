package JavaCollections;

import java.util.Vector;

public class JavaVector {

    public static void main(String[] args){

        Vector<String> vector = new Vector<>();

        //adding elements
        vector.add("saurabh");
        vector.add("aniket");
        vector.add("omkar");
        vector.add("shubham");
        vector.add("prajakta");

        System.out.println(vector);

        //removing elements
        System.out.println(vector.remove("aniket"));
        vector.remove(2);
        System.out.println(vector);

        //access elements
        System.out.println(vector.get(2));

        //update element
        vector.set(1,"Ajay");
        System.out.println(vector);


        System.out.println("Size of vector is : " + vector.size());
        System.out.println("Is vector contains Omkar :" + vector.contains("Omkar"));


    }
}
