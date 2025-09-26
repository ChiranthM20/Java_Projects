package practice_problems;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = input.nextInt();
        System.out.println("Check if "+n+" is power of two...");
        System.out.println(isPowerOfTwo(n));

    }
    static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }
}
