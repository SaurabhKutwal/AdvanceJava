package JavaPracticeProblems.JavaStrings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "Saurabh Kutwals";
        str = str.toLowerCase();

        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            freq.put(c,freq.getOrDefault(c,0) + 1);
        }
        System.out.println(freq);
        for(int i=0;i<str.length();i++){
            if(freq.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i) + " First non repeating character");
                break;
            }
        }
    }
}
