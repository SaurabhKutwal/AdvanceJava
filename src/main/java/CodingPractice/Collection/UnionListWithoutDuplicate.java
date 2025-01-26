package CodingPractice.Collection;

//Input: list1 = [1, 2, 3], list2 = [3, 4, 5]
//Output: [1, 2, 3, 4, 5]

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UnionListWithoutDuplicate {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3));
        List<Integer> list2 = new ArrayList<>(List.of(3,4,5));

        Set<Integer> union = new LinkedHashSet<>(list1);
        union.addAll(list2);

        System.out.println(union);

    }
}
