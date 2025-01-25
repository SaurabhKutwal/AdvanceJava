package CodingPractice.String;

//5.Find a Character's Frequency
//
//Input: String: "programming", Character: 'g'
//Output: 2

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {

        // single word freq.
        String word ="programming";
        char c = 'g';
        int freq = 0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == c) freq ++;
        }

        System.out.println(freq);

        // frequency of all characters

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            c = word.charAt(i);
            map.put(c, map.getOrDefault(c,0)+ 1);
        }

        System.out.println(map);
    }
}
