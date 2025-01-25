package CodingPractice.String;

// 4. Count Words in a Sentence
//
//Input: "Welcome to Java programming"
//Output: 5 words

public class CountOfWords {
    public static void main(String[] args) {
        String sentence = "Welcome to Java programming";
        int cntWords = 0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' ') cntWords++;
        }
        cntWords++;
        System.out.println(cntWords);
    }
}
