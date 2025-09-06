package java_programs.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day");
        String day = input.nextLine();

        switch(day){
            case "Monday" ->  System.out.println("Start of the week");
            case "Friday" ->   System.out.println("Almost End of the week");
            case "Saturday","Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Just a normal week day");

        }
    }
}
