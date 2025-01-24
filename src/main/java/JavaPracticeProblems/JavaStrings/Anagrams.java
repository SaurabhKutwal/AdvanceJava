package JavaPracticeProblems.JavaStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Raceaaa";
        String s2 = "Careaaa";

        //1 way:
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        boolean isAanagram = Arrays.equals(str1,str2);
        System.out.println(isAanagram);

        //2 way without sorting
        int[] chars = new int[26];
        for(int i=0;i<s1.length();i++){
            int t = (int)s1.charAt(i) - 97;
            chars[t] = chars[t] + 1;
        }

        for(int i=0;i<s2.length();i++){
            int t = (int)s2.charAt(i) - 97;
            chars[t] = chars[t] - 1;
        }

        boolean flag = true;
        for(int i=0;i<26;i++){
            if(chars[i] >0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);


    }
}
