package java_programs.OOPS.Packages.Package2;

import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println ("Hello");
        System.out.print("Please enter you name : ");
        String name = input.nextLine();
        System.out.println("Welcome "+name);
    }
    public static void message(){
        System.out.println("Hello World");
    }
}