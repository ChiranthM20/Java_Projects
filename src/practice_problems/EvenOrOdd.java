package practice_problems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        if (a % 2 ==0){
            System.out.print("even!");
        }else{
            System.out.print("odd!");
        }

    }
}
