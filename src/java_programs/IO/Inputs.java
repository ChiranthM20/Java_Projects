package java_programs.IO;

import java.util.Scanner;

public class Inputs{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter you name : ");
        String name = input.nextLine();

        System.out.println("Enter you age : ");
        int age = input.nextInt();

        System.out.println("Enter you height : ");
        float height = input.nextFloat();

        System.out.println("Enter you weight : ");
        float weight = input.nextFloat();

        System.out.println("Hi "+name+" you are "+age+" years old, your height is "+height+" and your  weight is "+weight+ "kg");
    }
}