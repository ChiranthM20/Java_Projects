package practice_problems;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =  input.nextInt();
        System.out.println(isArmstrong(n));
        System.out.println("Armstrong numbers between 100 and 999 are :");

        for(int i=100; i<=999; i++){

            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
