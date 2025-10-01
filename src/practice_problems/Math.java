//Problem: Sum of Two Numbers
//Write a Java program that:
//Takes two integers as input from the user.
//Adds them.
//Prints the result.

package practice_problems;
import java.util.Scanner;


public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int result = a+b;
        System.out.println("result : " + result);

        System.out.println("Done!");

    }
}
