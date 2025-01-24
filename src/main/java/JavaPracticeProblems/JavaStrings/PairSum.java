package JavaPracticeProblems.JavaStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, -1, 5 };
        int sum = 6;

        Set<Integer> set = new HashSet<>();
        for(int no:arr){
            if(set.contains(sum - no)){
                System.out.println(no + " " + (sum - no));
                set.remove(sum-no);
            }
            else{
                set.add(no);
            }
        }


    }
}
