package java_programs.Packages.Package2;

import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println ("Hello");
        System.out.print("Please enter you name : ");
        String name = input.nextLine();
        System.out.println("Welcome "+name);
    }
}