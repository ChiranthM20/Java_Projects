package java_programs.FunctionsMethods;

import java.util.Scanner;

public class Return {
    public static  void main(String[] args) {
        int ans = sum();
        System.out.println("sum = "+ans);
        String S = name();
        System.out.println("Hello "+S);

    }

    static int sum(){
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        return sum;
    }
    static String name(){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        return name;
    }
}
