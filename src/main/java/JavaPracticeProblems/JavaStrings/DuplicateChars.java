package JavaPracticeProblems.JavaStrings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "I am software Engineer";
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        String newStr = "";
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i)) > 0){
                newStr += str.charAt(i);
                map.put(str.charAt(i),-1);
            }
        }
        System.out.println(newStr);
    }
}
