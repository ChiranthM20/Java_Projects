package java_programs.Switch;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fruit: ");
        String Fruit = input.next();

        switch (Fruit){
            case "Apple" -> System.out.println("Red Colour");
            case "Orange" -> System.out.println("Orange Colour");
            case "Banana" -> System.out.println("Yellow Colour");
            case "Grape" -> System.out.println("Green Colour");
            default -> System.out.println("Unknown Fruit");
        }
    }
}
