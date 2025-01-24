package JavaPracticeProblems.JavaStrings;

import java.util.*;

public class CommonTwoArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 6, 3, 4, 5 };
        int[] b = { 2, 4, 3, 1, 0 };

        //1 using nested loops -> O(n^2)

        //2 using map
        Map<Integer,Integer> numbers = new HashMap<>();
        for(int i=0;i<b.length;i++){
            numbers.put(b[i],1);
        }
        for(int i=0;i<a.length;i++){
            if(numbers.get(a[i]) == null){
                System.out.println(a[i]);
            }
        }

        //3 using set
        Set<Integer> numbers2 = new HashSet<>();
        for (int j : b) {
            numbers2.add(j);
        }

        for(int i: a){
            if(!numbers2.contains(i)){
                System.out.println(i);
            }
        }


    }
}
