package CodingPractice.Collection;

//Input: map = {Alice=50, Bob=70, Charlie=60}
//Output (sorted by descending values): {Bob=70, Charlie=60, Alice=50}

import java.util.*;

public class SortMap {

    static Map<String,Integer> sortMap(Map<String,Integer> mp){
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(mp.entrySet());
        entries.sort((a,b) -> b.getValue() - a.getValue());

        Map<String,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry : entries){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String,Integer> mp = new TreeMap<>();
        mp.put("Bob",60);
        mp.put("Alice",50);
        mp.put("Charlie",70);

        Map<String,Integer> sortedMap = sortMap(mp);
        System.out.println(sortedMap);

    }
}
