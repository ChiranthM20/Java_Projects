package practice_problems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Enter an operator : ");
            char op = input.next().charAt(0);
            int ans = 0;

            if (op=='+'){
                ans = num1 + num2;
            }
            else if (op=='-'){
                ans = num1 - num2;
            }
            else if (op=='*'){
                ans = num1 * num2;
            }
            else if (op=='/'){
                ans = num1 / num2;
            }
            else if (op=='%'){
                ans = num1 % num2;
            }
            else if (op=='x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}
