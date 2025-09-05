//Problem: Check Even or Odd
//        Write a Java program that:
//        Asks the user to enter an integer.
//        Checks if the number is even or odd.
//        Prints the result.

package practice_problems;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        if (a % 2 ==0){
            System.out.print("even");
        }else{
            System.out.print("odd");
        }

    }
}
