package java_programs.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class input2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("Enter 9 numbers for matrix : ");

        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                arr[row][col] = sc.nextInt();
            }
        }

//        for (int row = 0; row < arr.length; row++) {
//              System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
