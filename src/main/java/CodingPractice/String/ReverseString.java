package CodingPractice.String;

//1 .Reverse a String -> Done
//
//Input: "hello"
//Output: "olleh"

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String revStr = "";

        for(int i=str.length()-1;i>=0;i--){
            revStr += str.charAt(i);
        }

        System.out.println(revStr);

    }
}
