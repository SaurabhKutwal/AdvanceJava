package CodingPractice.Collection;

//Convert Map to List of Objects
//
//Input: map = {A=10, B=20, C=30}
//Output: List of Pairs: [(A, 10), (B, 20), (C, 30)]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair<K,V>{
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return "(" + key + ", " + value + ")";
    }
}

public class ConvertMapToObjectList {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("A",10);
        mp.put("B",20);
        mp.put("C",30);

        List<Pair<String,Integer>> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            list.add(new Pair<>(entry.getKey(),entry.getValue()));
        }
        System.out.println(list);
    }
}
