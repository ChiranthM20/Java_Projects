package java_programs.IO;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x =  input.nextInt();
        while (x != 0) {
            int digit = x % 10;

            // Overflow check for 32-bit signed integer
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7));
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8));

            rev = rev * 10 + digit;
            x = x / 10;
        }
        System.out.println(rev);
    }
}
