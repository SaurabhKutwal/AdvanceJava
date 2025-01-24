package JavaPracticeProblems.JavaStrings;

public class SubString {
    public static void main(String[] args) {
        String s1 = "I am a software engineer";  //24 : 23-8 = 15
        String s2 = "engineer"; //8

        System.out.println(s1.contains(s2));

        //Logic
        System.out.println(s1.length() + " " +  s2.length());
        boolean flag = false;
        if(s1.length() < s2.length()){
            System.out.println("Not as subseq");
        }else {
            int ctrS1 = 0, ctrS2 = 0;
            for(int i=0;i<s1.length()-s2.length() + 1;i++){
                ctrS1 = i;
                ctrS2 = 0;
                while(ctrS2 < s2.length()){
                    if(s1.charAt(ctrS1) == s2.charAt(ctrS2)){
                        ctrS1++;
                        ctrS2++;
                    }
                    else{
                        break;
                    }
                }

                if(ctrS2 == s2.length()){
                    flag= true;
                    break;
                }
            }
        }
        if(flag) System.out.println("It is a subsequence");
        else System.out.println("Not a subsequence");
    }
}
