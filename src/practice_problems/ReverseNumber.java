package practice_problems;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456789;
        int ans = 0;
        System.out.println("Before Reverse: "+n);

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
        }
        System.out.println("After Reverse: "+ans);
    }
}