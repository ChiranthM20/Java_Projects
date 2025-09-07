package java_programs.Switch;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number (1 or 2): ");
        int num = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter letter (A or B): ");
        String letter = sc.nextLine();

        switch (num) {
            case 1 -> {
                switch (letter) {
                    case "A" -> System.out.println("You chose 1 and A");
                    case "B" -> System.out.println("You chose 1 and B");
                    default -> System.out.println("Invalid letter");
                }
            }
            case 2 -> {
                switch (letter) {
                    case "A" -> System.out.println("You chose 2 and A");
                    case "B" -> System.out.println("You chose 2 and B");
                    default -> System.out.println("Invalid letter");
                }
            }
            default -> System.out.println("Invalid number");
        }
    }
}
