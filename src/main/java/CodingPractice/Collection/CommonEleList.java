package CodingPractice.Collection;

//Input: list1 = [1, 2, 3, 4, 5], list2 = [3, 4, 5, 6, 7]
//Output: [3, 4, 5]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonEleList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(List.of(3,4,5,6,7));

        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>(list1);

        for(Integer ele : list2){
            if(numbers.contains(ele)){
                duplicates.add(ele);
            }
        }
        System.out.println(duplicates);

    }
}
