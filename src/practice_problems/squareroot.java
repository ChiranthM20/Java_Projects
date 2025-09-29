package practice_problems;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int x = sc.nextInt();
        int result = mySqrt(x);
        System.out.println("Square root rounded down: " + result);
    }
    static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;  // handle 0 and 1 directly

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {  // avoid overflow
                ans = mid;         // mid is a possible answer
                left = mid + 1;    // try a bigger number
            } else {
                right = mid - 1;   // mid*mid > x, try smaller number
            }
        }
        return ans;
    }
}
