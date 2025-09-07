package java_programs.FunctionsMethods;

import java.util.Scanner;

public class Math {

    static void sum(){
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        sum = num1+num2;

        System.out.println("Sum = "+sum);

    }
    static void diff() {
        Scanner input = new Scanner(System.in);
        int num1, num2, diff;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        diff = num1 - num2;

        System.out.print("Diff = " + diff);
    }

    public static void main(String[] args) {
        sum();
        diff();
    }
}
