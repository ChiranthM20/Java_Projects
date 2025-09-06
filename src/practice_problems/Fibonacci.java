package practice_problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();

        int a = 0, b = 1;

        if (n >= 1) {
            System.out.print(a);  // first term
        }
        if (n >= 2) {
            System.out.print(", " + b);  // second term
        }

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
}
