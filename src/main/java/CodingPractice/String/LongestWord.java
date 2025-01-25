package CodingPractice.String;

//Longest Word in a Sentence
//
//Input: "Find the longest word here"
//Output: "longest"

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Find the longest word here";
        int maxLen = -1;
        int len = 0;
        String longWord = "";
        String word = "";

        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) != ' '){
                word += sentence.charAt(i);
                len++;
            }
            else{
                if(len > maxLen) longWord = word;
                maxLen = len;
                word = "";
                len = 0;

            }
        }
        System.out.println(longWord);
    }
}
