package java_programs.ARRAYS;

import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];
        arr[3] = new int[1];


        for(int row=0; row<arr.length; row++) {
            int col;
            for (col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
