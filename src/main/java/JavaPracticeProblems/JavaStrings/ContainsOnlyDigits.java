package JavaPracticeProblems.JavaStrings;

public class ContainsOnlyDigits {
    public static void main(String[] args) {
        String str = "1234567890a";
        boolean flag = true;
        for(int i=0;i<str.length();i++){
            int ascii = str.charAt(i);
            if(ascii <48 || ascii > 57){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
