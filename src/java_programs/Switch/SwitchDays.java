package java_programs.Switch;

import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = input.nextLine();
//        switch (day) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.print("Weekday");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.print("Weekend");
//                break;
//            default:
//                System.out.println("Invalid day");
            switch(day){
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
                case "Saturday", "Sunday" -> System.out.println("Weekend");
                default -> System.out.println("Invalid day");
        }
    }
}
