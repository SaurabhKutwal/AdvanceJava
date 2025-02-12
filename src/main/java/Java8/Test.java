package Java8;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,1,2,3,4,5,2,5,5,5));

        //2nd largest occurring ele

        Map<Integer,Integer> mp = new HashMap<>();
        list.forEach(x -> mp.put(x,mp.getOrDefault(x,0)+1));
        System.out.println(mp);

        int max = -1;
        int secMax = -1;
        int maxKey = -1;
        int secMaxKey = -1;

        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue() > secMax){
                if(entry.getValue() > max){
                    secMax = max;
                    max = entry.getValue();

                    secMaxKey = maxKey;
                    maxKey = entry.getKey();
                }
                else{
                    secMax = entry.getValue();
                    secMaxKey = entry.getKey();
                }
            }
        }
        System.out.println(secMaxKey + " " + secMax);

    }
}
