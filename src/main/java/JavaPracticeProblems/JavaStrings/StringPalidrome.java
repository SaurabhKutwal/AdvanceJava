package JavaPracticeProblems.JavaStrings;

public class StringPalidrome {
    public static void main(String[] args) {

        String str = "abczzcba";


        // 1 method
        boolean flag = true;
        int i=0;
        int j = str.length() - 1;
        while (i<=j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("String is palidrome");
        else System.out.println("String is not Palidrome");
    }
}
