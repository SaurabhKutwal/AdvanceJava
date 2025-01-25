package CodingPractice.String;

//Remove Duplicates
//
//Input: "programming"
//Output: "progamin"

import java.util.HashMap;
import java.util.Map;


public class RemoveDuplicates {
    public static void main(String[] args) {
        //1 way
        String str = "programming";
        Map<Character, Integer> map = new HashMap<>();

        String str2 = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.get(c) == null){
                str2 += c;
            }
            map.put(c,1);
        }
        System.out.println(str2);

        // 2 way
        str2 = "";
        int[] chars = new int[26];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(chars[(int)c - 97] == 0){
                str2 += c;
            }
            chars[(int)c - 97] = 1;
        }

        System.out.println(str2);
    }
}
