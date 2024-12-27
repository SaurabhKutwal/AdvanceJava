package JavaCollections;

import java.util.*;

public class JavaArrayList {

    static class MyComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
    public static void main(String[] args){

        //Declaration
        List<Integer> list = new ArrayList<>(); // can be used the same ArrayList object reference.

        //adding elements to list
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(0,0); // index based adding element
        System.out.println(list);

        list.addAll(Arrays.asList(10,12,13)); //adding elements of collection to end of the current list
        System.out.println(list);
        list.addAll(1, Arrays.asList(21,22,23)); // adding collection ele to specific index.
        System.out.println(list);

        //accessing elements
        System.out.println("Element is :" + list.get(5)); // 0th based index access.

        //removing elements
        list.remove(3); // index based removal
        System.out.println(list);

        list.remove(Integer.valueOf(3)); //removing first occurrence of given object from list
        System.out.println(list);

        list.removeAll(Arrays.asList(10,12,13)); //removing elements present in given collection from current list
        System.out.println(list);

        //check existence of element in list
        System.out.println("Is 100 present in list : " + list.contains(100));

        //Update element i.e Replace element
        list.set(0,100); // index based update of list.
        System.out.println(list);

        System.out.println("Size of list is : " + list.size());


        //get index of element
        System.out.println("index of 22 is :" + list.indexOf(22)); //return first occurrence index only
        System.out.println("index of 5 is :" + list.indexOf(5)); // return -1 if not present in list
        //sorting list

        Collections.sort(list); // sort element ascending order only : natural sort.
        System.out.println(list);

        list.sort(new MyComparator()); //sorting using custom comparator
        System.out.println(list);

        list.sort((a,b) -> a-b); //sorting using lambda expression
        System.out.println(list);


        //Iteration on list

        for(int i=0;i<list.size();i++){     //Typical for loop
            System.out.println(list.get(i));
        }

        for(int i: list){   //Enhanced for loop
            System.out.println(i);
        }

        Iterator<Integer> itr = list.iterator(); //using object of Iterator interface
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
