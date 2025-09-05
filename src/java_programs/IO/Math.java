package java_programs.IO;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int A = Sc.nextInt();
        System.out.print("Enter the second number : ");
        int B = Sc.nextInt();

        int Sum = A+B;

        System.out.println("The sum of A and B is "+Sum);
        System.out.println("The difference of A and B is "+(A-B));
        System.out.println("The product of A and B is "+(A*B));
        System.out.println("The quotient of A and B is "+(A/B));

    }
}
