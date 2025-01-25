package CodingPractice.String;

//2 .Check for Palindrome
//
//Input: "madam"
//Output: true
//Input: "hello"
//Output: false
//Count Vowels and Consonants

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        int i=0;
        int j= str.length() - 1;
        boolean flag = true;

        while(i>=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
