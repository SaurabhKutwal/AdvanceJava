package Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericMethod2 {
    public static void main(String[] args) {

        //Find duplicates form arrayList
        List<Integer> list = new ArrayList<>(List.of(77,57,82,80,61,77,74,94,41,41));
        System.out.println(findDuplicate(list));

        List<String> names = new ArrayList<>(List.of("saurabh","ashwini","janhvi","saurabh","ashwini","vikram"));
        System.out.println(findDuplicate(names));
    }


    public static  <T> List<T> findDuplicate(List<T> list){
        Set<T> set = new HashSet<>();
        List<T> duplicates = new ArrayList<>();
        for(T ele : list){
            if(set.contains(ele)){
                duplicates.add(ele);
            }
            else{
                set.add(ele);
            }
        }
        return duplicates;
    }
}
