package JavaPracticeProblems.JavaStrings;

/*

Write a Java program to get the length of a given string.

        Sample Output:

        The string length of 'example.com' is: 11

*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int i=0;
        char c;
        try{
            while(true){
                c = s1.charAt(i);
                i++;
            }
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Length of string is :"  + i);
        }

    }
}
