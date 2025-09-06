// Check how many times 2 appears

package practice_problems;

public class CountNums {
    public static void main(String[] args) {
        int n = 1229121212;

        int count=0;

        while (n>0){
            int rem = n%10;
            if (rem == 2){
                count++;
            }
            n = n/10;
        }
        System.out.println("The number of times 2 Appeared : "+count+ " times");
    }
}
