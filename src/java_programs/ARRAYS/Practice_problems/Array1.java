//Declare an array of size 5 and initialize it with integers. Print all elements.

package java_programs.ARRAYS.Practice_problems;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {60,70,80,90,100};
        System.out.println(Arrays.toString(arr2));
    }
}
