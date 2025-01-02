package JavaPracticeProblems.JavaStrings;


/*

Write a Java program to compare two strings lexicographically.
        Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

        Sample Output:

        String 1: This is Exercise 1
        String 2: This is Exercise 2
        "This is Exercise 1" is less than "This is Exercise 2"

*/


import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings:");
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        System.out.println(s1 + " : "  + s2);

        if(s1.equals(s2)){
            System.out.println("Both are same");
        }
        else{
            int len = Math.min(s1.length(), s2.length());
            boolean flag = false;

            for(int i=0;i<len;i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    flag = s1.charAt(i) > s2.charAt(i);
                    break;
                }
            }

            if(flag){
                System.out.println(s2 + "  comes before " + s1);
            }
            else{
                System.out.println(s1 + " comes before " + s2);
            }
        }
    }
}
