package CodingPractice.String;

//String Compression
//
//Input: "aaabbc"
//Output: "a3b2c1"

public class StringCmpression {
    public static void main(String[] args) {
        String str = "aaabbc";
        String compStr = "";
        int cnt = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }
            else{
                compStr = compStr + str.charAt(i) + String.valueOf(cnt);
                cnt = 1;
            }
        }
        compStr = compStr + str.charAt(str.length()-1) + String.valueOf(cnt);
        System.out.println(compStr);
    }
}
