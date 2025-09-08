package java_programs.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the integers : ");

        for(int i=0;i<arr.length;i++){

            arr[i] =  input.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
