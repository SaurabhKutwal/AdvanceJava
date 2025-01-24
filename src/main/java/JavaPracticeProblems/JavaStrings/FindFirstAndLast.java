package JavaPracticeProblems.JavaStrings;

public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 1, 4, 7 ,8 ,8 };
        int x = 1;

        int firstidx = -1, lastidx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                if(firstidx == -1) firstidx = i;
                else lastidx = i;
            }
        }
        System.out.println(firstidx + " " + lastidx);
    }
}
