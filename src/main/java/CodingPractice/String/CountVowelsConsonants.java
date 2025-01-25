package CodingPractice.String;

//3.Count Vowels and Consonants
//
//Input: "Java Programming"
//Output: Vowels: 5, Consonants: 10

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Java Programming";
        str = str.toLowerCase();
        int cntVowels = 0, cntConsonants = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cntVowels++;
            }
            else if(c != ' ') cntConsonants++;
        }
        System.out.println("Vowels :" + cntVowels + ", " + "Consonants : " + cntConsonants);
    }
}
