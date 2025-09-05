//Problem: Find the Largest of Two Numbers
//        Write a Java program that:
//        Takes two numbers as input from the user.
//        Compares them.
//        Prints which number is larger (or if they are equal).

package practice_problems;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = Sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = Sc.nextInt();

        if (a>b){
            System.out.print("a is more than b");
        } else if (b>a) {
            System.out.print("b is more than a");

        }else{
            System.out.print("Both are equal");
        }


    }
}
