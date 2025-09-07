package java_programs.FunctionsMethods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String greet = greeting(name);
        System.out.println(greet);
    }
    static String greeting(String name){
        return "Hello! "+ name + ". How are you?";

    }
}
