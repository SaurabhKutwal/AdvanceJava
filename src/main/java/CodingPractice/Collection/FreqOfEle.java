package CodingPractice.Collection;

//Group Elements by Occurrence
//
//Input: list = [4, 5, 6, 4, 5, 4]
//Output: {4=3, 5=2, 6=1}

import java.util.*;

public class FreqOfEle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4, 5, 6, 4, 5, 4));
        Map<Integer,Integer> freq = new HashMap<>();
        list.forEach(x -> freq.put(x, freq.getOrDefault(x,0)+1));
        System.out.println(freq);

    }
}
