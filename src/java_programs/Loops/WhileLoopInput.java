package java_programs.Loops;

import java.util.Scanner;

public class WhileLoopInput {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i = 1;
        int n = S.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }

    }
}
