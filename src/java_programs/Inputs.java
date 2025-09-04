package java_programs;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String A = input.nextLine();
        //next() only prints the first string
        //nextLine() prints the entire string

        System.out.print("Enter Your roll number : ");
        int roll = input.nextInt();

        System.out.print("Enter your marks : ");
        float marks = input.nextFloat();




        System.out.println("Your name is " + A);
        System.out.println("Your roll number is " +  roll);
        System.out.println("You scored " +  marks);
    }
}
