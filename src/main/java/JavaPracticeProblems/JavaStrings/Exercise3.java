package JavaPracticeProblems.JavaStrings;



/*

34. Write a Java program to find the second most frequent character in a given string.

        Sample Output:

        The given string is: successes
        The second most frequent char in the string is: c
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        int[] chars = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        for(int i=0;i<s.length();i++){
            int idx = (int)s.charAt(i)-97;
            chars[idx]++;
        }

        int max = -1,sedMax = -1;
        int index = 0;
        for(int i=0;i<26;i++){
            if(chars[i] > max){
                max = chars[i];
            }
            else if(chars[i] > sedMax){
                sedMax = chars[i];
                index = i;
            }
        }

        System.out.println("Second most appeared character is : " + (char)(chars[index]+97));

    }
}
