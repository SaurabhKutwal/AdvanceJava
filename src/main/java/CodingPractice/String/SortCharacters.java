package CodingPractice.String;


//Sort Characters
//
//Input: "programming"
//Output: "aggimmnoprr"


import java.util.Collections;

import static java.util.Arrays.sort;


public class SortCharacters {
    public static void main(String[] args) {
        String str = "programming";
        char[] chars = str.toCharArray();
        String str2 = "";
        sort(chars);
        for(int i=0;i<chars.length;i++){
            str2 += chars[i];
        }
        System.out.println(str2);
    }
}
