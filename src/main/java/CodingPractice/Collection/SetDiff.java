package CodingPractice.Collection;

//set1 = [1, 2, 3, 4, 5]
//set2 = [3, 4, 6, 10]

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDiff {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,6,10));

        set1.forEach(x -> {
            if (!set2.contains(x)) System.out.println(x);
        });

    }
}
