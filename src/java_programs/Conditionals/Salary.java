package java_programs.Conditionals;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int salary = input.nextInt();
        if (salary>10000 && salary<30000){
            salary+=2000;
            System.out.println("You got bonus of 2000, new salary="+salary);
        }else if (salary>=30000){
            salary+=3000;
            System.out.println("You got bonus of 3000, new salary="+salary);
        }else{
            salary+=1000;
            System.out.println("You got bonus of 1000, new salary="+salary);
        }
    }
}
