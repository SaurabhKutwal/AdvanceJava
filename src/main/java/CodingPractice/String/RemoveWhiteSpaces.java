package CodingPractice.String;

//6.Remove Whitespace
//
//Input: "Java is fun"
//Output: "Javaisfun"

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Java is fun";
        String str2 = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' ') str2 += str.charAt(i);
        }
        System.out.println(str2);

        //Other way
        System.out.println(str.replaceAll(" ", ""));
    }
}
