package JavaPracticeProblems.JavaStrings;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingEle {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 0, 99, 11};

        boolean flag = false;

        Set<Integer> numbers = new HashSet<>();
        for(int no : arr){
            if(numbers.contains(no)){
                System.out.println("First repeated no : " + no);
                flag = true;
                break;
            }
            numbers.add(no);
        }

        if(!flag){
            System.out.println("No no is repeated.");
        }
    }
}
