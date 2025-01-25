package CodingPractice.String;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
    public static void main(String[] args) {
        String str = "listen";
        String str2 = "silent";

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(int i=0;i<str2.length();i++){
            char c = str2.charAt(i);
            map.put(c, map.getOrDefault(c,0) - 1);
        }

        for(Character c : map.keySet()){
            if(map.get(c) != 0){
                System.out.println(false);
                break;
            }
        }

        System.out.println(map);
    }
}
