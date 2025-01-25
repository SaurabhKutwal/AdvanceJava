package JavaPracticeProblems.JavaStrings;

public class ReverseStringWithoutLibMethod {
    public static void main(String[] args) {
        String str = "SaurabhKutwal";
        String revStr = "";
        for(int i=str.length()-1;i>=0;i--){
            revStr += str.charAt(i);
        }

        System.out.println("Original String "+str);
        System.out.println("Reversed String "+revStr);


        String stm = "I am Automation Engineer";
        String revStm = "";

        //Without CharArrayMethod;
         String[] words = stm.split(" ");
         for(int i=words.length-1;i>=0;i--){
             revStm += words[i] + " ";
         }

        System.out.println("Original String "+stm);
        System.out.println("Reversed String "+revStm);


    }
}
