package practice_problems;

import java.util.Scanner;

public class Base7Converter {

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int rem = num % 7;
            result.append(rem);
            num = num / 7;
        }

        if (isNegative) {
            result.append("-");
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.println("Base 7 Representation: " + convertToBase7(num));

        sc.close();
    }
}
