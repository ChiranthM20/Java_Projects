package practice_problems;

import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int temp;


        System.out.println("Before Swapping : a="+a+" "+"b="+b);

        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping : a="+a+" "+"b="+b);
    }
}
